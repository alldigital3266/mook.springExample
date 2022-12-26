package kr.co.mook.service;

import java.util.List;

import kr.co.mook.vo.BoardVO;
import kr.co.mook.vo.MemberVO;

public interface BoardService {

	BoardVO getBoard(int boardNum);

	int addBoard(BoardVO vo);

	int delBoard(int boardNum);

	List<BoardVO> getList();

	BoardVO login(String boardPwd, String irum);

}
