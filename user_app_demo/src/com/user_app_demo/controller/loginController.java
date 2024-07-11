package com.user_app_demo.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user_app_demo.models.Database;
import com.user_app_demo.models.Login;

@WebServlet("/loginController")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public loginController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String emailid = request.getParameter("emailid");
	
	String password = request.getParameter("password");
	
	Login login=new Login();
	
	Database db=new Database();
	
	Connection con = db.establishConnection() ;
	
	boolean result = login.verifyLogin(emailid, password,con);
	
	//System.out.println(result);
	
	HttpSession session = request.getSession(true);
	
	if(result==true) {
		session.setAttribute("emailid ", emailid );
		
		RequestDispatcher rd1 = request.getRequestDispatcher("WEB-INF/views/userRejistration.jsp");
		 rd1.forward(request, response);
		
		
	}else {
		
		
		request.setAttribute("errorMsg", "invalid username /password");
		
		 RequestDispatcher rd1 = request.getRequestDispatcher("index.jsp");
		 rd1.forward(request, response);
	
		
	}
	
	}

}
