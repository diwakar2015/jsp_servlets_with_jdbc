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

<center>
<h3> Add New Person</h3></br></br></br>
<form name="addPage" method="post" action="addPerson">


Person ID<input type="text" name="personID"/></br></br>
Last Name<input type="text" name="lastName" /></br></br>
First Name<input type="text" name="firstName"/></br></br>
Address <input type="text" name="address" /></br></br>
City <input type="text" name="city" /></br></br>

<input type="submit" name="submit" value="Add Person"/></br>

</form>
</center>


</body>
</html>