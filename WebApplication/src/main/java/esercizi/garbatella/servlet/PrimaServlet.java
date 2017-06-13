package esercizi.garbatella.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
public class PrimaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String attribute = (String) request.getParameter("ciao");
		System.out.println(attribute);
		String attribute2 = (String) request.getParameter("ciao2");
		System.out.println(attribute2);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("<html><body>");
		out.print("<h1>Mi hai inviati i seguenti ciao:</h1>");
		out.print("<h1>questo è il primo:</h1>");
		out.print(attribute);
		out.print("<h1>Mi hai inviati i seguenti ciao2:</h1>");
		out.print("<h1>questo è il secondo:</h1>");
		out.print("<h1>" + attribute2 + "</h1>");


		out.print("</body></html>");
	}

}
