package P2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class RegisterUserSarvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegisterUserSarvlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");
		String Email = request.getParameter("Email");
		
		System.out.println(name);
		System.out.println(phone);
		System.out.println(city);
		System.out.println(Email);
		
		try {
			
	       Class.forName("com.mysql.jdbc.Driver");
	       
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_app_4", "root", "admin");
			
			Statement stmnt = con.createStatement();
			
			stmnt.executeUpdate("insert into Register values('"+name+"','"+phone+"','"+city+"','"+Email+"')");
			con.close();
			
		}catch(Exception e) {
			
			System.out.println(e);
			
		}
		
		
	}

}
