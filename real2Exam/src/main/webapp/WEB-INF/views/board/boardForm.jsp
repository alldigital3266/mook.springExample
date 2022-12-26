<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/board/input" method="post">
		<table>
				<tr><td>이름 : </td><td><input type="text" name="irum"/></td></tr>
				<tr><td>비밀번호 : </td><td><input type="text" name="boardPwd"/></td></tr>
				<tr><td>제목 : </td><td><input type="text" name="boardTitle"/></td></tr>
				<tr><td>내용 : </td><td><textarea name="boardContent" id="" cols="30" rows="10"></textarea></td></tr>
		</table>
	    <br />
	    <input type="submit" value="확인"/>&nbsp;&nbsp;&nbsp;&nbsp;
	    <input type="reset" value="취소"/>
	
	</form>




</body>
</html>