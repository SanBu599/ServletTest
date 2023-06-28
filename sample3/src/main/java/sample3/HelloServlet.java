package sample3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//doProc(req,resp);
		
		
		// Servlet -> java(html)
		// JSP -> html(java)
		
		
		String name = req.getParameter("name");		// JSP	request.getParameter
		String sage = req.getParameter("age");
		int age = Integer.parseInt(sage);
		
		// Servlet -> web
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		
		pw.println("<head>");
		pw.println("</head>");
		
		pw.println("<body>");
		pw.println("<h1>Hello Servlet</h1>");
		
		pw.println("<p>이름:"+ name + "</p>");
		pw.println("<p>나이:"+ age + "</p>");
		
		pw.println("</body>");
		
		pw.println("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//doProc(req,resp);
		
		req.setCharacterEncoding("utf-8");
		
		String name = req.getParameter("name");		// JSP	request.getParameter
		String sage = req.getParameter("age");
		int age = Integer.parseInt(sage);
		
		// Servlet -> web
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		
		pw.println("<head>");
		pw.println("</head>");
		
		pw.println("<body>");
		pw.println("<h1>Hello Servlet</h1>");
		
		pw.println("<p>이름:"+ name + "</p>");
		pw.println("<p>나이:"+ age + "</p>");
		
		pw.println("</body>");
		
		pw.println("</html>");
	}
	

	/*
	 * public void doProc(HttpServletRequest req, HttpServletResponse resp) throws
	 * ServletException, IOException{
	 * 
	 * }
	 */
}
