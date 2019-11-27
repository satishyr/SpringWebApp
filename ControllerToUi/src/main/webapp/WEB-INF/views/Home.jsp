<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	object data:${emp }
	<br /> equals to:${emp.toString() }
	<br /> Data:${emp.eid },${emp.esal },${emp.ename }
	<br /> Array:${mydata[0] },${mydata[1] },${mydata[2]}
	<br /> List:${lsobj }
	<br /> Map:${mapobj }
	<br />
</body>
</html>