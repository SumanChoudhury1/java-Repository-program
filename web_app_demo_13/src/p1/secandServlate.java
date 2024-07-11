package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/secandServlate")
public class secandServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public secandServlate() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		String name =(String) session.getAttribute("msg");
		
		String	abc=(String)request.getAttribute("xyz");
		
		
		PrintWriter out = response.getWriter();
		out.println("session data : "+name);
		out.println("session data : "+abc);
		
	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	HttpSession session = request.getSession();
	String name = (String)session.getAttribute("msg");
	String abc=(String)request.getAttribute("xyz");
	
	PrintWriter out = response.getWriter();
	out.println("session data : "+name);
	out.println("Attribute Data : "+abc);
	}

}
