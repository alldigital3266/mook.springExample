package com.mook.nUser.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mook.nUser.UserVO;
import com.mook.nUser.dao.UserDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/bean.xml")
public class UserDAOTest {
	@Autowired
	ApplicationContext context;
	
	UserDAO dao;
	UserVO vo1, vo2, vo3;
	
	@Before
	public void initSetUp() {
		context = new GenericXmlApplicationContext("/bean.xml");
		this.dao = context.getBean("userDAO", UserDAO.class);
		this.vo1 = new UserVO("alldigital1", "최한묵", "alldigital32");
		this.vo2 = new UserVO("alldigital2", "김정국", "kimjung");
		this.vo3 = new UserVO("alldigital3", "이상록", "leedang");
	}
	
	@Test
	public void userDAOTest() {
		dao.deleteAll();
		assertEquals(dao.getCount(), 0);
		dao.add(vo1);
		assertEquals(dao.getCount(), 1);
		dao.add(vo2);
		assertEquals(dao.getCount(), 2);
		dao.add(vo3);
		assertEquals(dao.getCount(), 3);
		
		UserVO rvo;
		
		rvo = dao.get(vo1.getId());
		assertEquals(rvo.getName(), vo1.getName());
		assertEquals(rvo.getPassword(), vo1.getPassword());
		
		rvo = dao.get(vo2.getId());
		assertEquals(rvo.getName(), vo2.getName());
		assertEquals(rvo.getPassword(), vo2.getPassword());
		
		rvo = dao.get(vo3.getId());
		assertEquals(rvo.getName(), vo3.getName());
		assertEquals(rvo.getPassword(), vo3.getPassword());
		
		List<UserVO> listVO = dao.getAll();
		
		for( UserVO vo: listVO) {
			System.out.println("ID = " + vo.getId() + 
					           ", Name = " + vo.getName() + 
					           ", Password = " + vo.getPassword());
		}
		
	}
	
}
