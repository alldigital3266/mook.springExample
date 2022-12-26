<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원 로그인</h1>

<form action="/board/confirm" method="post">
	<table>
		<tr><td>아이디:</td><td> <input type="text" name="memId" /></td></tr>
		<tr><td>비밀번호:</td><td> <input type="password" name="memPwd" /></td></tr>
		<tr>&nbsp;</tr>	
		<tr>&nbsp;</tr>	
		<tr><td><input type="submit" value="확인"/></td><td><input type="reset" /></td></tr>
	</table>
</form>

<form action="/board/memberJoin">
	<input type="submit" value="회원 가입"/>
</form>

</body>
</html>