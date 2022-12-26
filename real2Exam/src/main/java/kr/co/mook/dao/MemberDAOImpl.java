package kr.co.mook.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.mook.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	SqlSession session;
	
	@Override
	public MemberVO getMember(String memId) {
		
		return session.selectOne("kr.co.mook.MemberDao.getMember", memId);
	}

	@Override
	public int addMember(MemberVO vo) {
		return session.update("kr.co.mook.MemberDao.addMember", vo);
	}

	@Override
	public int delMember(String memId) {
		
		return session.update("kr.co.mook.MemberDao.delMember", memId);
	}

	@Override
	public MemberVO confirmMember(Map<String, String> loginInfo) {
		Map<String, String> map = new HashMap<>();
		
		return session.selectOne("kr.co.mook.MemberDao.confirmMember", loginInfo);
	}


}
