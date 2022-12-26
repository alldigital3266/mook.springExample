package kr.co.mook.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.mook.service.MemberService;
import kr.co.mook.vo.MemberVO;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@RequestMapping("/memberJoin")
	public String addMemberForm() {
		return "/member/memberJoin";
		
	}
	
	@RequestMapping("/memberJoinProc")
	public String addMember(MemberVO vo, Model model, HttpSession session) {

		int result = service.addMember(vo);
		
		if( result == 1) {
			session.setAttribute("vo", vo);
		}
		
		return "home";
	}

	@RequestMapping("/logout")
	public String logOut(HttpServletRequest request) {
		request.getSession().invalidate();
		return "home";
		
	}

	@RequestMapping("/login")
	public String login(String memId, String memPwd, HttpSession session) {
		MemberVO vo = null; 

		Map<String, String> map = new HashMap<String, String>();
		map.put("memId", memId);
		map.put("memPwd", memPwd);
		
		vo = service.confirmMember(map); 	

		if ( vo == null ) return "/member/loginFail";
		
		session.setAttribute("vo", vo);
		
		return "/home";
	}

	@RequestMapping("/loginForm")
	public String loginForm() {
		return "/member/loginJoin";
	}	

}
