package sample5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		// 짐풀러!
		
		Human human = (Human)req.getAttribute("human");
		
		PrintWriter pw = resp.getWriter();
		
		pw.println("<html>");
		
		pw.println("<head>");
		pw.println("</head>");
		
		pw.println("<body>");
		
		pw.println("<h1>Sample Servlet</h1>");		
		pw.println("<p>이름:" + human.toString() + "</p>");
				
		pw.println("</body>");		
		pw.println("</html>");
	}

}
