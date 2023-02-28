package com.nestjavatraining.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nestjavatraining.dao.EmployeeService;
import com.nestjavatraining.dao.EmployeeServiceImpl;
import com.nestjavatraining.entity.Employee;



@WebServlet("/register")
public class EmployeeController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private EmployeeService employeeDao;

    public void init() {
        employeeDao = new EmployeeServiceImpl();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");

        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setUsername(username);
        employee.setPassword(password);
        employee.setContact(contact);
        employee.setAddress(address);

        try {
            employeeDao.createEmployee(employee);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.getMessage();
        }

        response.sendRedirect("index.jsp");
    }
}
