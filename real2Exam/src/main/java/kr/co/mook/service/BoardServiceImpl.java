package kr.co.mook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.mook.dao.BoardDAO;
import kr.co.mook.vo.BoardVO;
import kr.co.mook.vo.MemberVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO dao;
	
	@Override
	public BoardVO getBoard(int boardNum) {
		return dao.getBoard(boardNum);
	}

	@Override
	public int addBoard(BoardVO vo) {
		
		return dao.addBoard(vo);
	}

	@Override
	public int delBoard(int boardNum) {
		
		return dao.delBoard(boardNum);
	}

	@Override
	public List<BoardVO> getList() {
		
		return dao.getList();
	}

	@Override
	public BoardVO login(String boardPwd, String irum) {
		return dao.login(boardPwd, irum);
	}

}
