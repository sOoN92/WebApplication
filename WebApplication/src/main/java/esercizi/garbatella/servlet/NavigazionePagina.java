package esercizi.garbatella.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NavigazionePagina extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String parameter = req.getParameter("ciao");
		try{
			int valore = Integer.parseInt(parameter);
			RequestDispatcher requestDispatcherObj = req.getRequestDispatcher("/new.jsp");
			double quadrato = Math.pow(valore, 2);
			req.setAttribute("quadrato", quadrato);
			requestDispatcherObj.forward(req, resp);
			
		}
		catch (NumberFormatException e){
			RequestDispatcher requestDispatcherObj = req.getRequestDispatcher("/altra.jsp");
			req.setAttribute("stringa", parameter.toUpperCase());
			requestDispatcherObj.forward(req, resp);
			
		}
		
	}
	

}
