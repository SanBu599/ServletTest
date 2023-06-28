package work;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.startup.SetContextPropertiesRule;

public class Load extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		
		Survey survey = (Survey)req.getAttribute("survey");
		
		PrintWriter pw = resp.getWriter();
		
		pw.println("<html>");
		pw.println("<head>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>조사결과</h1>");
		pw.println("<p> 이름 : "+survey.getName()+"</p>");
		pw.println("<p> 영어회화 관심도 : "+survey.getQ1()+"</p>");
		if(survey.getQ2() != null) {
			for (int i = 0; i < survey.getQ2().length; i++) {
				pw.println("<p> 관심있는 어학 :"+survey.getQ2()[i]+"</p>");
			}
		}
		
		
		
		pw.println("<p> 영어 수업에 대한 의견 : "+survey.getQ3()+"</p>");
		pw.println("<p> 나이대 : "+survey.getQ4()+"</p>");
		pw.println("</body>");		
		pw.println("</html>");
	}

}
