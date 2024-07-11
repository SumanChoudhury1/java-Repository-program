package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/firstServlate")
public class firstServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public firstServlate() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		HttpSession session = request.getSession();
		session.setAttribute("msg", name);
		
		request.setAttribute("xyz", name);
		
		RequestDispatcher rd = request.getRequestDispatcher("secandServlate");
		rd.forward(request, response);
		
		//response.sendRedirect("secandServlate");
		
		
	}

}
