package com.calculation.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.calculation.models.AddNumbers;


@WebServlet("/AddNumberServlate")
public class AddNumberServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AddNumberServlate() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	try {	
		
		
int fname = Integer.parseInt(request.getParameter("fname"));

int lname = Integer.parseInt(request.getParameter("lname"));

AddNumbers add = new AddNumbers();
int result = add.addNumber(fname, lname);

request.setAttribute("result", "The Total Number Is : "+result);
RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
	rd.forward(request, response);
	
	}catch(Exception e) {
		request.setAttribute("valid input", "invalid input ");
		RequestDispatcher rd1 = request.getRequestDispatcher("index.jsp");
		rd1.forward(request, response);
		
		
	}
	}

}
