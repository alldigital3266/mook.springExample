<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>회원 가입</h1>
	
	<form action="/board/memberJoinProc" method="post">

	<table>
		<input type="text" name="memId" placeholder="아이디"/> <br />
		<input type="text" name="memName" placeholder="이름"/> <br />
		<input type="password" name="memPwd" placeholder="비밀번호"/> <br />
		<input type="text" name="phone" placeholder="전화번호">
		<button>회원 가입</button>
	</table>
	</form>

</body>
</html>