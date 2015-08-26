<%@page import="jdbcexamples.MyApp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="session.jsp" %>  

	<center>
		<h3>
			Hello!!
			<%=name%>
			, You have logged in!! | <a href="addPerson.jsp">Add a new person</a>  |     | <a href="personreport.jsp">Reports</a>  |    <a href="logout.jsp">Logout></a>
		</h3>
	</center>

	<%
		ResultSet results = MyApp.getAllPersons();
	%>
	<table border="1" style="width: 100%">
		<tr>
			<th>Person ID</th>
			<th>Last name</th>
			<th>First Name</th>
			<th>Address</th>
			<th>City</th>
		</tr>
		<%
			while (results.next()) {
		%>
		<tr>
			<td><%=results.getInt(1) %></td>
			<td><%=results.getString(2) %></td>
			<td><%=results.getString(3) %></td>
			<td><%=results.getString(4) %></td>
			<td><%=results.getString(5) %></td>
			<td><a href="DeletePerson?personId=<%=results.getInt(1)%>">Delete</a></td>
			<td><a href="EditPerson?personId=<%=results.getInt(1)%>">Edit</a></td>
		</tr>

		<%
			}
		%>

	</table>

</body>
</html>





