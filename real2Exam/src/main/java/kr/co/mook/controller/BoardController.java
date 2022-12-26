package kr.co.mook.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.mook.service.BoardService;
import kr.co.mook.service.MemberService;
import kr.co.mook.vo.BoardVO;
import kr.co.mook.vo.MemberVO;

@Controller
//@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	BoardService service;
	
	@Autowired
	MemberService msService;

	@RequestMapping("/board")
	public String firstVisit() {
		return "/board/loginForm";
	}
	
	@RequestMapping("/board/confirm")
	public String confrim(String memId, String memPwd, HttpSession session) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("memId", memId);
		map.put("memPwd", memPwd);
		
		MemberVO mvo = msService.confirmMember(map);
		
		if( mvo == null) return "/board/loginForm";

		session.setAttribute("mvo", mvo);

		List<BoardVO> list = service.getList();
		session.setAttribute("list", list);
		
		return "/board/boardList";
	}

	@RequestMapping("/board/boardList")
	public String showList(HttpSession session) {

		List<BoardVO> list = service.getList();
		session.setAttribute("list", list);

		return "/board/boardList";
	}
	
	@RequestMapping("/board/logout")
	public String logout(HttpServletRequest request) {
		
		request.getSession().invalidate();
		
		return "/board/loginForm";
	}
	
	@RequestMapping("/board/inputForm")
	public String boardForm() {
		
		return "/board/boardForm";
	}
	
	@RequestMapping("/board/input")
	public String inputSave(BoardVO vo, HttpSession session, Model model) {

		String boardTitle = vo.getBoardTitle();
		String boardPwd = vo.getBoardPwd();
		String irum = vo.getIrum();
		
		int result = 0;
		
		if (boardTitle != "" && boardPwd !="" && irum !="") {
			result = service.addBoard(vo);
		}

		model.addAttribute("result", result);
		
		return "board/inputStatus";
	}
	
	@RequestMapping("/board/memberJoin")
	public String memberJoin() {
		
		return "board/memberJoin";
	}
	
	@RequestMapping("/board/memberJoinProc")
	public String memberJoinProc( MemberVO mvo, HttpSession session, Model model ) {
		String message = ""; 
		
		String memId = mvo.getMemId();
		String memPwd = mvo.getMemPwd();
		String memName = mvo.getMemName();
		String phone = mvo.getPhone();
		
		int result = 0;

		if ( memId != "" && memPwd != "" && memName != "") {
			
			MemberVO vo = msService.getMember(memId);
			
			if (vo != null) {
				message = "존재하는 아이디 입니다.";
				model.addAttribute("message", message);
				return "/board/joinFailForm";
			}
			
			result = msService.addMember(mvo);
		}
		
		message = "입력하지 않은 내용이 있습니다.";
		model.addAttribute("message", message);

		if( result == 1) {
			session.setAttribute("mvo", mvo);
			return "/board/joinCompleteForm";
		}
		
		return "/board/joinFailForm";
	}


}
