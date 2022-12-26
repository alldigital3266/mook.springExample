package kr.co.mook.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller //RestController
@RequestMapping(value = {"/yang", "/yangdoll", "/doll"})  //class level에서 배열 사용은 거의 없음.
//@RequiredArgsConstructor
public class TestController {

	@Autowired
	//public final BoardMapper mapper;
	
    @RequestMapping("/")
	public String root() {
		//중간에 처리할 내용 -> DB 목록을 aaa에 보내줌
		return "/yangdoll/aaa";
	}
   
    @RequestMapping({"/qqqq", "/wwww", "/eeee", "/rrrr"} )
    public String qwer() {
    	return "yangdoll/aaa";
    }

    /*
    //단순하게 URL과 같은 해당 페이지로 이동
    @RequestMapping({"/ttt"} )
    public String ttt() {
    	return "yangdoll/ttt";
    }
    @RequestMapping({"/zzz"} )
    public String zzz() {
    	return "yangdoll/zzz";
    }
    @RequestMapping({"/xxx"} )
    public String xxx() {
    	return "yangdoll/xxx";
    }
    */
    
    // yangdoll => 일반 회원 yang => 우수 회원 doll => VIP 회원
    // ttt => 가전 목록, zzz => 생활제품, xxx -> 자옹차 용품
    @RequestMapping({"/ttt", "/zzz", "/xxx"})
    public void tzx() {
    }
    
    
    
    
    
    
}
