<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page | Two</title>
</head>
<body>
<center>
<table>
	<tr>
		<td>교필</td>
		<td>핵교</td>
		<td>전지</td>
		<td>전기</td>
		<td>전선</td>
		<td>자율</td>
		<td>총학점</td>
	</tr>
	<tr>
		<td><c:out value="${twoVO.ku}"></c:out></td>
		<td><c:out value="${twoVO.hac}"></c:out></td>
		<td><c:out value="${twoVO.ji}"></c:out></td>
		<td><c:out value="${twoVO.gi}"></c:out></td>
		<td><c:out value="${twoVO.sun}"></c:out></td>
		<td><c:out value="${twoVO.ja}"></c:out></td>
		<td><c:out value="${twoVO.sum}"></c:out></td>
	</tr>
</table>
</center>
</body>
</html>