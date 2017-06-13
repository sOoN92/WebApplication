package esercizi.garbatella.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckBox extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//crea un array della lunghezza uguale al numero di valori che ho "checkato
		String[] frutti = request.getParameterValues("frutto");


		// String attribute2 = (String) request.getParameter("ciao2");
		// System.out.println(attribute2);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		for (int i = 0; i < frutti.length; i++) {
			
				
			out.print("<html><body>");
			out.print("<h1>Hai slezionato: "+ frutti[i] + "</h1>");
			out.print("</body></html>");
		}
		out.print("<html><body>");
		out.print("<h1>Hai scelto "+ frutti.length + " frutti.</h1>");
		out.print("</body></html>");
	}

}
