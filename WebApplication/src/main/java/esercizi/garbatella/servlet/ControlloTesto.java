package esercizi.garbatella.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControlloTesto extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String attribute = (String) request.getParameter("t1");
//		System.out.println(attribute);
//		String attribute2 = (String) request.getParameter("ciao2");
//		System.out.println(attribute2);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		System.out.println("il testo inserito è: " + attribute);
		
		try {
			int parseInt = Integer.parseInt(attribute);
			out.print("<html><body>");
			out.print("<h1>" + (5 + parseInt) + "</h1>");
			out.print("</body></html>");

		} catch (NumberFormatException exp) {

			out.print("<html><body>");
			out.print("<h1>Hai inserito un Testo e non un Numero</h1>");
			out.print("</body></html>");
		}
		
		out.print("<html><body>");
		out.print("<h1>" + 5 + " " +  attribute + "</h1>");
		out.print("</body></html>");


	}

}
