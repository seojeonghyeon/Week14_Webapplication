<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page | Four</title>
</head>
<body>
<table>
	<tr>
		<td>수강년도</td>
		<td>학기</td>
		<td>교과코드</td>
		<td>교과목명</td>
		<td>구분</td>
		<td>학점</td>
	</tr>
	<c:forEach var="classVO" items="${ClassVOs}">
	<tr>
		<td><c:out value="${classVO.class_Year}"></c:out></td>
		<td><c:out value="${classVO.class_Term}"></c:out></td>
		<td><c:out value="${classVO.class_Code}"></c:out></td>
		<td><c:out value="${classVO.class_Title}"></c:out></td>
		<td><c:out value="${classVO.class_Section}"></c:out></td>
		<td><c:out value="${classVO.class_Point}"></c:out></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>