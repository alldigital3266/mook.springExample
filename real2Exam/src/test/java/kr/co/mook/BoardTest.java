package kr.co.mook;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.mook.service.BoardService;
import kr.co.mook.vo.BoardVO;
import kr.co.mook.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardTest {
	
	@Autowired
	BoardService service;
	
	@Ignore
	@Test
	public void getBoardTest() {
		BoardVO vo = service.getBoard(20);
		assertNotNull(vo);
		System.out.println(vo);
	}

	@Ignore
	@Test
	public void addBoardTest() {
		BoardVO vo = new BoardVO();
		vo.setBoardTitle("새로운 내용 ");
		vo.setBoardContent("새로운 컨텐츠 ***");
		vo.setBoardPwd("1234");
		vo.setIrum("민밈닌");
		
		int result = service.addBoard(vo);
		assertEquals(result, 1);
		
	}
	
	@Ignore
	@Test
	public void delBoardTest() {
		int result = service.delBoard(21);
		assertEquals(result, 1);
	}
	
	@Ignore
	@Test
	public void getListTest() {
		List<BoardVO> list = service.getList();
		
		for( BoardVO vo : list) {
			System.out.println(vo);
		}
	}
	
	@Test
	public void login() {
		BoardVO vo = service.login("1234", "민밈닌");
		
		System.out.println(vo);
		
	}
	
	

}
