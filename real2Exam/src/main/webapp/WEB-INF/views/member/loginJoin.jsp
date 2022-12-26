<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인</h1>
	
	<form action="/member/login">
		<input type="text" name="memId" /> <br />
		<input type="text" name="memPwd" /> <br />
		<input type="submit" value="로그인" />
		<input type="reset" value="입력취소" />
	</form>
</body>
</html>