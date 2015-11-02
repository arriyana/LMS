<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LMS | Create Task</title>
</head>
<body>
<div>
<p>Rooms:</p>
<select>
	<c:forEach items="${rooms}" var="room">
		<option value="${room.id}">${room.number}</option>
	</c:forEach>
</select>
</div>
</body>
</html>