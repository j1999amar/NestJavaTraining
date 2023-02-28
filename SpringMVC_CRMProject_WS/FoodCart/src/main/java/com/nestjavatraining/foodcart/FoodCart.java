package com.nestjavatraining.foodcart;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nestjavatraining.foodcart.entity.Food;
import com.nestjavatraining.foodcart.service.FoodCartServiceImpl;


@WebServlet("/FoodCart")
public class FoodCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	FoodCartServiceImpl foodCartServiceImpl = new FoodCartServiceImpl();


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				
		
		ArrayList<Food> foodList =foodCartServiceImpl.getFoodList();
		request.setAttribute("foodList", foodList);

	RequestDispatcher dispatcher= request.getRequestDispatcher("show-foods.jsp");
	dispatcher.forward(request, response);
	}

}
