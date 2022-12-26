<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	* {
	list-style: none;
	text-decoration: none;
	}
	
	table, td, th{
	border: 1px solid tomato;
	border-collapse: collapse;
	}

	.contents{
	display: none;
	}
	
	a::hover .contents{
	display: block;
	}

</style>

</head>
<body>
<h1>게시판 리스트 : (접속하신분)<span>${mvo.memId}</span></h1>

<table>
		<tr>
		<th>번호</th><th>제목</th><th>이름</th><th class="contents">내용</th><th>날짜</th>
		</tr>
	<c:forEach var="vo" items="${list}">
		<tr>
			<td>${vo.boardNum}</td>
			<td class="title"><a href="#">${vo.boardTitle}</a></td>
			<td>${vo.irum}</td>
			<td class="contents" >${vo.boardContent}</td>
			<td>${vo.regiDate}</td>
		</tr>
	</c:forEach>
</table>
<br />
<button><a href="/board/inputForm">게시판 입력</a></button> &nbsp;&nbsp;&nbsp;
<button><a href="/board/logout">로그아웃</a></button>



</body>
</html>