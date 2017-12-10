<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page | Three</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">
</head>
<body>
<center>
<sf:form method="post" action="${pageContext.request.contextPath}/class/save" modelAttribute="classVO">
<table>
	<tr>
		<td>수강년도 : </td>
		<td><sf:input type="text" id="class_Year" path="class_Year" name="class_Year"/><br/>
		<sf:errors path="class_Year" class="error"/></td>
	</tr>
	<tr>
		<td>학기 : </td>
		<td><sf:input type="text" id="class_Term" path="class_Term" name="class_Term"/><br/>
		<sf:errors path="class_Term" class="error"/></td>
	</tr>
	<tr>
		<td>교과코드 : </td>
		<td><sf:input type="text" id="class_Code" path="class_Code" name="class_Code"/><br/>
		<sf:errors path="class_Code" class="error"/></td>
	</tr>
	<tr>
		<td>교과목명 : </td>
		<td><sf:input type="text" id="class_Title" path="class_Title" name="class_Title"/><br/>
		<sf:errors path="class_Title" class="error"/></td>
	</tr>
	<tr>
		<td>구분 : </td>
		<td><sf:input type="text" id="class_Section" path="class_Section" name="class_Section"/><br/>
		<sf:errors path="class_Section" class="error"/></td>
	</tr>
	<tr>
		<td>학점 : </td>
		<td><sf:input type="text" id="class_Point" path="class_Section" name="class_Point"/><br/>
		<sf:errors path="class_Point" class="error"/></td>
	</tr>
</table>
<input type="submit" value="Submit"/>
</sf:form>
</center>
</body>
</html>