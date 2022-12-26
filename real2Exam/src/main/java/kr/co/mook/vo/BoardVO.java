package kr.co.mook.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class BoardVO {

	private int boardNum;
	@NonNull
	private String boardTitle;
	@NonNull
	private String irum;
	@NonNull
	private String boardPwd;
	private String boardContent;
	private String regiDate;
}
