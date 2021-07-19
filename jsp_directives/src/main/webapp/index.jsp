<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library</title>

<style type="text/css">
ul>li{
display: inline;
padding: 10px 10px;
}
</style>
</head>
<body>



<c:set var ="title" value="Gandhi Library" scope="page"/>

<h1 style="text-align: center; color: #0000ff">
<c:out value="${title }"/>
</h1>
<%@ include file="menu.html" %>

</body>
</html>