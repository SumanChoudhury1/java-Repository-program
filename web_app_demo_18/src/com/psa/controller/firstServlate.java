package com.psa.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/firstServlate")
public class firstServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public firstServlate() {
        super();
    }
    
    public void init(ServletConfig config) {
    	
    	System.out.println("From init");
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	System.out.println("From doPost()");
	}
	
	public void destroy() {
		System.out.println("From destroy()");
	}

}
