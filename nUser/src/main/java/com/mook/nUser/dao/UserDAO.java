package com.mook.nUser.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mook.nUser.UserVO;

public class UserDAO {
	
	//private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<UserVO> rowMapper = new RowMapper<>() {

		@Override
		public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			UserVO user = new UserVO();
			
			user.setId( rs.getString("id"));
			user.setName( rs.getString("name"));
			user.setPassword( rs.getString("password"));
			
			return user;
		}
	};

	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		//this.dataSource = dataSource;
	}
	public void add(UserVO user) {
		jdbcTemplate.update("insert into users values (?,?,?)",
							user.getId(), user.getName(), user.getPassword());
	}
	public int deleteAll() {
		return jdbcTemplate.update("delete from users");
	}
	public int deleteOne(String id) {
		return jdbcTemplate.update("delete from users where id = ?", id);
	}
	public int getCount() {
		return jdbcTemplate.queryForObject("select count(*) from users", Integer.class);
	}
	public UserVO get(String id) {
		return jdbcTemplate.queryForObject("select * from users where id = ?", 
				                           new Object[] {id}, rowMapper);
	}
	public List<UserVO> getAll(){
		return jdbcTemplate.query("select * from users order by id", rowMapper);
	}

}
