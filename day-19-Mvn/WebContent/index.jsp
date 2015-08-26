<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center><h2>Login Page</h2>

<form name="frm" method="post" action="LogInServlet">
Enter your name<input type="text" name="userName"></input></br>
Enter your Password<input type="password" name="password"></input></br>

<input type="submit" value="Login" name="submit"/>
</form>

</br>
To register <a href="register.jsp">Click Here</a>
</center>
</body>
</html>