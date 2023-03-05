<%@ taglib prefix="cl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Food Menu</title>
</head>
<body bgcolor="lightcoral">
	<center>
		<h1>Foods</h1>
		<table border="5" cellpadding="20">
			<tr>
				<th>Code</th>
				<th>Items</th>
				<th>Price</th>
			</tr>
			<cl:forEach var="items" items="${foodList }">
				<tr>
					<td>${items.id}</td>
					<td>${items.item}</td>
					<td>${items.price}</td>
				</tr>
			</cl:forEach>

		</table>
	</center>
</body>
</html>