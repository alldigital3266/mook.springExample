package kr.co.mook.dao;

import java.util.List;

import kr.co.mook.vo.BoardVO;
import kr.co.mook.vo.MemberVO;

public interface BoardDAO {

	BoardVO getBoard(int boardNum);

	int addBoard(BoardVO vo);

	int delBoard(int boardNum);

	List<BoardVO> getList();

	BoardVO login(String boardPwd, String irum);

}
