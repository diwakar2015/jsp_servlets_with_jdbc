<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registerratio  Page</title>
</head>
<body>

<center>
<h3>Registration Page</h3>
</br>
<form name="registerUser" method="post" action="RegisterUserServlet">

User Name<input type="text" name="username" /></br>
Password <input type="password" name ="password"/></br>
E-Mail <input type="text" name ="email"/></br>
<input type="submit" name="submit" value="Register"/></br>

</form>
</center>


</br>
To Login <a href="index.jsp">Click Here</a>
</body>
</html>