<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Titolo della JSP</title>
</head>
<body>



<!-- <form action="Hello"> -->

<!-- 	Inserisci il valore di ciao:<br> -->
<!-- 	<input type = "text" name = "ciao"><br> -->
<!-- 	Inserisci il valore di ciao2:<br> -->
<!-- 	<input type = "text" name ="ciao2"><br> -->
<!-- 	<input type="submit" value = "Invia"><br> -->


<!-- </form> -->

<!-- <form action="Testo"> -->

<!-- 	Inserire Testo o Numero:<br> -->
<!-- 	<input type = "text" name = "t1"><br> -->
<!-- 	<input type = "submit" value = "Invia"><br> -->

<!-- </form> -->

<!-- <form action="Mps"> -->

<!-- 	Inserire un'opzione:<br> -->
<!-- 	<input type = "radio" name = "radioButton" value = "Mattina" checked> Mattina<br> -->
<!-- 	<input type = "radio" name = "radioButton" value = "Pomeriggio"> Pomeriggio<br> -->
<!-- 	<input type = "radio" name = "radioButton" value = "Sera"> Sera<br> -->
	
<!-- 	<input type = "submit" value = "Invia"><br> -->

<!-- </form> -->

<!-- <form action="Frutta"> -->
	
<!-- 	Scegliere Frutti:<br> -->
<!-- 	<input type="checkbox" name="frutto" value="Banana"> Banana<br> -->
<!-- 	<input type="checkbox" name="frutto" value="Pera"> Pera<br> -->
<!-- 	<input type="checkbox" name="frutto" value="Mela"> Mela<br> -->
<!-- 	<input type="checkbox" name="frutto" value="Ananas"> Ananas<br> -->
<!-- 	<input type="checkbox" name="frutto" value="Anguria"> Anguria<br> -->
<!-- 	<input type="checkbox" name="frutto" value="Kiwi"> Kiwi<br> -->
	
<!-- 	<input type = "submit" value = "Invia"><br> -->
		 
<!-- </form> -->


<!-- <form action="NavPag"> -->

<!-- 	Inserire Testo o Numero:<br> -->
<!-- 	<input type = "text" name = "ciao"><br> -->
<!-- 	<input type = "submit" value = "Invia"><br> -->

<!-- </form> -->


<!-- <form action="CittaStato"> -->

<!-- 	Inserire un'opzione:<br> -->
<!-- 	<input type = "radio" name = "radioButton" value = "ITA" checked> Italia<br> -->
<!-- 	<input type = "radio" name = "radioButton" value = "FRA"> Francia<br> -->
<!-- 	<input type = "radio" name = "radioButton" value = "DEU"> Germania<br> -->
	
<!-- 	<input type = "submit" value = "Invia"><br> -->

<!-- </form> -->


	<%
	List<String> lista = (ArrayList<String>) request.getAttribute("listaCitta");
	for (String s : lista) {
	%>
		<%=s%><br>
	
	<%
		}
	%>
  <br><br>



</body>
</html>