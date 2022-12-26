package kr.co.mook;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.mook.dao.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BaiscTest {

	@Autowired
	ApplicationContext context;
	
	@Autowired
	DataSource ds;
	
//	@Autowired
//	JdbcTemplate template;
	
	@Autowired
	SqlSession session;
	
	@Autowired
	MemberDAO dao=null;
			
	//@Ignore
	@Test
	public void contextTest() {
		assertNotNull(context);
	}
	
	//@Ignore
	@Test
	public void dataSourceTest() {
		assertNotNull(ds);
	}
	
	//@Ignore
	@Test
	public void jdbcDataSourceTest() throws SQLException {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement("select sysdate from dual");
			rs = ps.executeQuery();
			
			assertNotNull(rs);
			while ( rs.next() ) {
				System.out.println( rs.getString(1));
			}

		} catch (SQLException e){
			e.printStackTrace();
		} finally {
			con.close();
			ps.close();
			rs.close();
		}
	
	}	
	/*
	 * @Test public void jdbcTemplateTest() { assertNotNull(ds); String result =
	 * template.queryForObject("select sysdate from dual", String.class);
	 * assertNotNull(result); System.out.println(result); }
	 * 
	 */

	//@Ignore
	@Test
	public void sqlSessionTest() {
		assertNotNull(session);
		System.out.println("++++" + session);
	}
	
	//@Ignore
	 //@Test 
	 //public void sampleDaoTest() { 
		// assertNotNull(dao);
		// String result = dao.getTime(); 
		 //assertNotNull(result);
		// System.out.println("########" + result); }
}
