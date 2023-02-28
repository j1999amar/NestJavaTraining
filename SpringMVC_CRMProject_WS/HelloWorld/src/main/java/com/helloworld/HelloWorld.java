package com.helloworld;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class HelloWorld extends HttpServlet {
	
	public void service(ServletRequest request ,ServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.getWriter().print("Hello World");
	}

}
