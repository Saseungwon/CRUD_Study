<!-- 2 view -> student -> jsp만들기 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<%
	request.setCharacterEncoding("utf-8");
%>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
리스트
${studentList }

<table border="1">
	<c:forEach items="${studentList }" var="student"> <!-- var에 적은 값의 타입은 StudentVO -->
		<tr>
			<td><a href="studentView.do?stNo${student.stdNo }">${student.stdNo }</a></td>
			<td>${student.stdName }</td>
			<td>${student.stdBirth }</td>
			<td>${student.stdSex }</td>
		</tr>
	</c:forEach>
</table>


</body>
</html>