package kr.co.mook;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.mook.service.MemberService;
import kr.co.mook.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberTest {
	
	@Autowired
	MemberService service;
	
	@Test
	public void getMemberTest() {
		
		MemberVO vo = service.getMember("aaaa");
		assertNotNull(vo);
		System.out.println(vo);
		
	}
	
	@Test
	public void addMemberTest() {
		MemberVO vo = new MemberVO();
		
		vo.setMemId("fffe");
		vo.setMemName("Jung");
		vo.setMemPwd("125678");
		vo.setPhone("01033344455");
		
		service.addMember(vo);
		
		MemberVO resultVO = service.getMember(vo.getMemId());
				
		checkVo(vo, resultVO);	
		
		service.delMember(vo.getMemId());
		
	}
	
	private void checkVo(MemberVO inVO, MemberVO resultVO) {
		assertEquals(inVO.getMemName(), resultVO.getMemName());
		assertEquals(inVO.getPhone(), resultVO.getPhone());
	}
	
	@Test
	public void confrimMemberTest() {
		
		Map<String, String> map = new HashMap<>();
		map.put("memId", "dddd");
		map.put("memPwd", "choi1234567");
		
		MemberVO  vo = service.confirmMember(map);
		
		System.out.println(vo);
		
	}
	
	
}
