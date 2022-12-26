<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="kr.co.mook.vo.MemberVO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>
		Hello world!  
	</h1>

	<header>
		<c:choose>
			<c:when test="${vo != null}">
				<button><a href="/member/logout">로그아웃</a></button> &nbsp;&nbsp;&nbsp;&nbsp;
				<button><a href="">정보 변경 </a></button> <br />
				<span>${vo.memName}님 환영 합니다. </span>
			</c:when>
			<c:otherwise>
				</button><a href="/member/loginForm">로그인</a></button> &nbsp;&nbsp;&nbsp;&nbsp;
				</button><a href="/member/memberJoin">회원 가입</a></button>
			</c:otherwise>
		</c:choose>
	
	</header>
	<br />
	<br />
	
	<div>
		<section>1. 상품 리스트 </section>
		<section>2. 상품 리스트 </section>
		<section>3. 상품 리스트 </section>
		<section>4. 상품 리스트 </section>
		<section>5. 상품 리스트 </section>
	</div>

	<footer>
		<h3>footer 위치</h3>
	</footer>	
</body>
</html>
