package com.nestjavatraining.foodcart.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.nestjavatraining.foodcart.entity.Food;

public class FoodCartServiceImpl implements FoodCartService {
	
	

	@Override
	public ArrayList<Food> getFoodList() {
		
		ArrayList<Food> food =new ArrayList<>();

		String url="jdbc:mysql://127.0.0.1:3306/food?useSSL=false";
		String username="root";
		String password="";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection =DriverManager.getConnection(url,username,password);
			Statement stmt=connection.createStatement();
		    ResultSet result=stmt.executeQuery(" SELECT * FROM fooditems ");
		    while(result.next()) {
		    	
		    	food.add(new Food(result.getInt(1),result.getString(2),result.getString(3)));
		    	System.out.println(result.getString(2));
		    	
		    }
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return food;
	}

	

}
