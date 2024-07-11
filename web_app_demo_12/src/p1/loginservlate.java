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

@WebServlet("/loginservlate")
public class loginservlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public loginservlate() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String emailid = request.getParameter("emailid");
		
		String password = request.getParameter("password");
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_app ", "root","admin");
			Statement stmnt = con.createStatement();
			ResultSet results = stmnt.executeQuery("select * from login where emailid='"+emailid+"' and password='"+password+"'");
			
			//System.out.println(results.next());
			
			if(results.next()) {
				RequestDispatcher rd1 = request.getRequestDispatcher("WEB-INF/views/welcome.html");
				rd1.forward(request, response);
				
			}else {
			 RequestDispatcher rd2 = request.getRequestDispatcher("index.html");
			 rd2.include(request, response);
			}
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}

}
