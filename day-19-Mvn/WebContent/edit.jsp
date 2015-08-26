<%@page import="java.io.PrintWriter"%>
<%@page import="jdbcexamples.MyApp"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

String personID = request.getParameter("id");

int id = Integer.parseInt(personID);

ResultSet result = MyApp.getPersonById(id);

/* PrintWriter w = response.getWriter();
w.write("res --> "+ result); */

%>
<center>
<h3> Edit Page for Person ID <%=id %></h3></br></br></br>
<form name="editPage" method="post" action="UpdatePerson">

<%
while(result.next())
{
%>
Person ID<input type="text" name="personID" value="<%=result.getInt(1)%>" readonly/></br></br>
Last Name<input type="text" name="lastName" value="<%=result.getString(2)%>" /></br></br>
First Name<input type="text" name="firstName" value="<%=result.getString(3)%>" /></br></br>
Address <input type="text" name="address" value="<%=result.getString(4)%>" /></br></br>
City <input type="text" name="city" value="<%=result.getString(5)%>" /></br></br>

<input type="submit" name="submit" value="Update Person"/></br>
<%} %>
</form>
</center>


</body>
</html>