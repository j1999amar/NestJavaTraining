<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Product</title>
</head>
<body>
	<Center>
		<div id="wrapper">
			<div id="header">
				<h2>Update Product</h2>
			</div>
		</div>

		

			<form:form action="addProduct" modelAttribute="diplayUpdateProduct"
				method="POST">

				<!-- need to associate this data with customer id  -->
				<form:hidden path="productId" />

				<table>
					<tbody>
						<tr>
							<td><label>Product:</label></td>
							<td><form:input path="productName" /></td>
						</tr>

						<tr>
							<td><label>Product Type:</label></td>
							<td><form:input path="productType" /></td>
						</tr>

						<tr>
							<td><label>Price:</label></td>
							<td><form:input path="price" /></td>
						</tr>

						<tr>
							<td><label></label></td>
							<td><input type="submit" value="Save" class="save" /></td>
						</tr>


					</tbody>
				</table>


			</form:form>




		</div>
	</Center>
</body>

</html>