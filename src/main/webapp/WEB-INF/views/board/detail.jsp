<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp" %>

<h1>detail page</h1>
<hr/>
<div>id가 2번인 페이지면 관리자 메시지를 걸어보자</div>
<!-- if문 필요 -->
<c:if test="${board.id == 2}">
	<h2>관리자</h2>
</c:if>
<hr/>
<div>id가 1번이면 OK를 출력하고, id가 2번이면 NO를 출력</div>
<c:choose>
	<c:when test="${board.id == 1}">
		<h2>OK</h2>
	</c:when>
	<c:otherwise>
		<h2>NO</h2>
	</c:otherwise>
</c:choose>
번호: ${board.id}</br>
제목: ${board.title}</br>
내용: ${board.content}

<%@ include file="../layout/footer.jsp" %>