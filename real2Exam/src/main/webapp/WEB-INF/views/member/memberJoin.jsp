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
	
	<form action="/member/memberJoinProc" method="post">

		<input type="text" name="memId"/> <br />
		<input type="text" name="memName"/> <br />
		<input type="password" name="memPwd"/> <br />
		<input type="password" /> <br />
		<input type="text" name="phone"/>
	
		<button>회원 가입</button>
	
	</form>

</body>
</html>