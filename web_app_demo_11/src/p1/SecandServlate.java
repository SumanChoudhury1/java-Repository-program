package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SecandServlate")
public class SecandServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SecandServlate() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name =(String) request.getAttribute("msg");
		//System.out.println(name);
		PrintWriter out = response.getWriter();
		out.println(name);
	}

}
