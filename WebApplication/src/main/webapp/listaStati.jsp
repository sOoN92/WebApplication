<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pagina JSP CITTA</title>
</head>
<body>
	Lista degli Stati:

	<%
	List<String> lista = (ArrayList<String>) request.getAttribute("listaStati");
	if (lista != null) {
%>
	<form action="Stati" method="post">

		<select name="citta">
			<%
				for (String s : lista) {
			%>
			<option value="<%=s%>">
				<%=s%>
			</option>

			<%
				}
			%>
		</select> <br> <br> <input type="submit">
	</form>
	<%
		} else {
	%>
	
		<form action="Stati">
		<input type="submit" value="invia">
		</form>
	<%
		}
	%>	
	
</body>
</html>