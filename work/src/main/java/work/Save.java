package work;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Save extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		
		String name = req.getParameter("name");
		String q1 = req.getParameter("q1");
		String[] q2 = req.getParameterValues("q2");
		String q3 = req.getParameter("q3");
		String q4 = req.getParameter("q4");
		
		Survey survey = new Survey(name,q1,q2,q3,q4);
		
		req.setAttribute("survey", survey);
		
		req.getRequestDispatcher("load").forward(req, resp);
	}
	
}
