package kr.co.mook.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.mook.dao.MemberDAO;
import kr.co.mook.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	
	private MemberDAO dao;
	
	@Autowired
	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}

	@Override
	public MemberVO getMember(String memId) {
		return dao.getMember(memId);
	}

	@Override
	public int addMember(MemberVO vo) {
		return dao.addMember(vo);
	}

	@Override
	public int delMember(String memId) {
		return dao.delMember(memId);
		
	}

	@Override
	public MemberVO confirmMember(Map<String, String> loginInfo) {
		
		return dao.confirmMember(loginInfo);
	}

}
