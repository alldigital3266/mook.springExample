package kr.co.mook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberVO {

	private String memId;
	private String memName;
	private String memPwd;
	private String phone;
	private String regiDate;
	
}
