<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>a2.jsp</title>
</head>
<body>
<p><br/></p>
<div class="container" style="text-align:center">
	<h2>20대 추천 도서 목록입니다.</h2>
	<h4>검색자 : ${name}</h4>
	<h4>성별 : ${gender}</h4>
	<p>교양 : ${book}</p>
	<hr/>
	<p>
		<a href="${ctp}/">홈으로</a>
		<%-- 
		<a href="${ctp}/atom/a2">a2.jsp</a>
		<a href="${ctp}/atom/a3">a3.jsp</a>
		 --%>
	</p>
	<hr/>
</div>
<p><br/></p>
</body>
</html>