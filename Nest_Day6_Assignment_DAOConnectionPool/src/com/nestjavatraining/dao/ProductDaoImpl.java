package com.nestjavatraining.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import com.nestjavatraining.connectionpool.ConnectionPool;
import com.nestjavatraining.entity.Product;

public class ProductDaoImpl implements ProductDao {

	Scanner scanner = new Scanner(System.in);

	@Override
	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
		Connection connection = null;

		String insertSQL = "Insert into product(productcode,productname,productdescription,activationdate,expirydate) values(?,?,?,?,?)";
		PreparedStatement prepStmt = null;

		try {
			DataSource ds = ConnectionPool.getDataSource();
			connection = ds.getConnection();

			prepStmt = connection.prepareStatement(insertSQL);
			prepStmt.setString(1, product.getProductCode());
			prepStmt.setString(2, product.getProductName());
			prepStmt.setString(3, product.getProductDescription());
			prepStmt.setDate(4, (Date) product.getActivationDate());
			prepStmt.setDate(5, (Date) product.getExpiryDate());
			prepStmt.executeUpdate();

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Product> listAllProducts() {
		List<Product> productList = new ArrayList<Product>();
		Connection connection = null;
		String selectSQL = "Select * from product";
		PreparedStatement prepStmt = null;
		try {
			DataSource ds = ConnectionPool.getDataSource();
			connection = ds.getConnection();
			prepStmt = connection.prepareStatement(selectSQL);
			ResultSet resultSet = prepStmt.executeQuery();
			while (resultSet.next()) {
				productList.add(new Product(resultSet.getString(2), resultSet.getString(3), resultSet.getString(4),
						resultSet.getDate(5), resultSet.getDate(6)));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productList;
	}

	@Override
	public void getProduct(String productCode) {
		List<Product> productList = new ArrayList<Product>();
		Connection connection = null;
		String selectSQL = "SELECT * FROM `product` WHERE `productcode`= "+"'"+productCode+"'";
		PreparedStatement prepStmt = null;
		try {
			DataSource ds = ConnectionPool.getDataSource();
			connection = ds.getConnection();
			prepStmt = connection.prepareStatement(selectSQL);
			ResultSet resultSet = prepStmt.executeQuery();
			String output = null;
			while (resultSet.next()) {
				output=("Account Number : "+resultSet.getString(2)+"\nAccount Type "+ resultSet.getString(3)+"\nAccount Description Date "+ resultSet.getString(4)+"\nAccount Opened Date "+
						resultSet.getDate(5)+"\nAccount Expire Date "+ resultSet.getDate(6));
			}
			System.out.print(output);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProduct(String productCode) {
		// TODO Auto-generated method stub
		Connection connection = null;

		String deleteQuery = "DELETE FROM `product` WHERE `productcode`= ?";
		PreparedStatement prepStmt = null;

		try {

			DataSource ds = ConnectionPool.getDataSource();
			connection = ds.getConnection();
			prepStmt = connection.prepareStatement(deleteQuery);
			prepStmt.setString(1, productCode);
			prepStmt.executeUpdate();
			System.out.println("Account Number " + productCode + "is deleted");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
