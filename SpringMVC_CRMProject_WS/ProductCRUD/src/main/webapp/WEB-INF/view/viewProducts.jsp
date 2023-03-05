<%@ taglib prefix="cl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Products</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>
</head>
<body>
	<center>
		<input type="button" value="Add Products"
			onclick="window.location.href='displayAddProduct'; return false;"
			class="add-button" />
		<h1>Products</h1>
		<table border="5" cellpadding="20">

			<tr>
				<th>Product Name</th>
				<th>Product Type</th>
				<th>Price</th>
				<th>Actions</th>
			</tr>
			<cl:forEach var="items" items="${productList }">

				<cl:url var="updateLink" value="/product/diplayUpdateProduct">
					<cl:param name="productId" value="${items.productId}" />
				</cl:url>
				<cl:url var="deleteLink" value="/product/deleteProduct">
					<cl:param name="productId" value="${items.productId}" />
				</cl:url>

				<tr>
					<td>${items.productName}</td>
					<td>${items.productType}</td>
					<td>${items.price}</td>
					<td><a href="${updateLink}">Update</a> <a href="${deleteLink}">Delete</a>


					</td>
				</tr>
			</cl:forEach>

		</table>
	</center>

</body>
</html>