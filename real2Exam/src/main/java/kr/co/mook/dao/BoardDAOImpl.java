package kr.co.mook.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.mook.vo.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO{

	@Autowired
	SqlSession session;
	
	@Override
	public BoardVO getBoard(int boardNum) {
		return session.selectOne("kr.co.mook.BoardDao.getBoard", boardNum);
	}

	@Override
	public int addBoard(BoardVO vo) {
		return session.insert("kr.co.mook.BoardDao.addBoard", vo);
	}

	@Override
	public int delBoard(int boardNum) {
		return session.delete("kr.co.mook.BoardDao.delBoard", boardNum);
	}

	@Override
	public List<BoardVO> getList() {
		return session.selectList("kr.co.mook.BoardDao.getList");
	}

	@Override
	public BoardVO login(String boardPwd, String irum) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("boardPwd", boardPwd);
		map.put("irum", irum);
		return session.selectOne("kr.co.mook.BoardDao.login", map);
	}

}
