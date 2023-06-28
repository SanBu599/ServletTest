package sample5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		
		String name = req.getParameter("name");
		String sage = req.getParameter("age");
		int age = Integer.parseInt(sage);
		String address = req.getParameter("address");
		
		System.out.println(name+ " " + age + " " + address);
		
		Human human = new Human(name,age,address);
		// 짐싸!
		req.setAttribute("human", human);		// human =>변수
		
		// servlet sample로 이동해라
		req.getRequestDispatcher("sample").forward(req, resp);
		
		
	}


}
