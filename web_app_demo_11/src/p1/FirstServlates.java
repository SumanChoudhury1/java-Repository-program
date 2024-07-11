package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlates")
public class FirstServlates extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FirstServlates() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String name = request.getParameter("name");
	request.setAttribute("msg" , name);
	RequestDispatcher rd = request.getRequestDispatcher("SecandServlate");
	rd.forward(request, response);
		
	}

}
