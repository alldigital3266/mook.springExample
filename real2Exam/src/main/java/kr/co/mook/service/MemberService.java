package kr.co.mook.service;

import java.util.Map;

import kr.co.mook.vo.MemberVO;

public interface MemberService {

	MemberVO getMember(String memId);

	int addMember(MemberVO vo);

	int delMember(String memId);

	MemberVO confirmMember(Map<String, String> loginInfo);

}
