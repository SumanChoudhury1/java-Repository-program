package p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateForm")
public class UpdateForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateForm() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		String email = request.getParameter("email");
		String phoneNo = request.getParameter("phoneNo");
		
		//System.out.println(email);
		//System.out.println(phoneNo);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ web_app_4","root","admin");
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("UPDATE  Register SET phone = '"+phoneNo+"' WHERE Email='"+email+"' ");
			con.close();
			
		}catch(Exception e){
			System.out.println(e);
			
		}
		
	}

}
