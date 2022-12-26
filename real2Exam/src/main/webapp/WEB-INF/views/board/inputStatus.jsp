<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>입력 현황</h1>

	<c:choose>
		<c:when test="${result == 1 }">
	 		<p>입력이 완료 되었습니다.</p>
		</c:when>
	    <c:otherwise>
	 		<p>입력에 실패 하였습니다.</p>
	    </c:otherwise>
	</c:choose>

     <button><a href="/board/boardList">전체 리스트 보기</a></button>
     
</body>
</html>