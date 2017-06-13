package esercizi.garbatella.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GestioneStati extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher requestDispatcherObj = request.getRequestDispatcher("/listaStati.jsp");
		ArrayList<String> stati = stati(DBConnection.connessione());
		request.setAttribute("listaStati", stati);
		requestDispatcherObj.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String attribute = request.getParameter("citta");
		ArrayList<String> listaCitta = cittaStato(attribute, DBConnection.connessione());
		request.setAttribute("listaCitta", listaCitta);
		RequestDispatcher requestDispatcherObj = request.getRequestDispatcher("/prova.jsp");
		requestDispatcherObj.forward(request, response);

	}

	private static ArrayList<String> stati(Connection connection) {

		ArrayList<String> listaStati = new ArrayList<>();
		try {
			PreparedStatement prepared = connection.prepareStatement("SELECT Code FROM Country");
			ResultSet executeQuery = prepared.executeQuery();
			while (executeQuery.next()) {
				// System.out.println(executeQuery.getString("code"));
				listaStati.add(executeQuery.getString("Code"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listaStati;

	}

	public static ArrayList<String> cittaStato(String stato, Connection connection) {

		ArrayList<String> listaCitta = new ArrayList<>();
		try {
			PreparedStatement prepared = connection.prepareStatement("SELECT Name FROM City WHERE CountryCode = ?");
			prepared.setString(1, stato);
			ResultSet executeQuery = prepared.executeQuery();
			while (executeQuery.next()) {
				// System.out.println(executeQuery.getString("Name"));
				listaCitta.add(executeQuery.getString("Name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listaCitta;

	}

}
