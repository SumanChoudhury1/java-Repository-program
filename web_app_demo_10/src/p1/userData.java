package p1;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userData")
public class userData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public userData() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_app_4","root","admin");
			
			Statement stmnt = con.createStatement();
			
			ResultSet result = stmnt.executeQuery("select * from Register");
			
			PrintWriter out = response.getWriter();
			
			out.println("<table border='1'>");
			out.println("<tr>");
			out.println("<th>");
			out.println("FullName");
			out.println("</th>");
			out.println("<th>");
			out.println("phone");
			out.println("</th>");
			out.println("<th>");
			out.println("city");
			out.println("</th>");
			out.println("<th>");
			out.println("Email");
			out.println("</th>");
			out.println("</tr>");
			
			while(result.next()) {
				out.println("<tr>");
				out.println("<td>");
				out.println(result.getString(1));
				out.println("</td>");
				out.println("<td>");
				out.println(result.getString(2));
				out.println("</td>");
				out.println("<td>");
				out.println(result.getString(3));
				out.println("</td>");
				out.println("<td>");
				out.println(result.getString(4));
				out.println("</td>");
				out.println("</tr>");
			}
			
			out.println("</table>");
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
