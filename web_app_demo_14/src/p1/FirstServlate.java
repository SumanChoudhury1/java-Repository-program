package p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FirstServer")
public class FirstServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FirstServlate() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
		String username= request.getParameter("username");
		
		String password = request.getParameter("password");
		
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_app","root","admin");
		
			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery("select * from  login where emailid='"+username+"' and password='"+password+"'");
			
			HttpSession session = request.getSession(true);
			
			if(result.next()){
				
				session.setAttribute( "username",username );
				System.out.println(session.getAttribute("username"));
				RequestDispatcher rd1 = request.getRequestDispatcher("WEB_INF/views/registration.html");
				rd1.include(request, response);
				
				
			}else {
				
				RequestDispatcher rd2 = request.getRequestDispatcher("index.html");
				rd2.include(request, response);
				
				
			}
			
	}catch(Exception e){
		
		System.out.println(e);
		
	}
	
		
	}

}
