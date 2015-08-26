

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdbcexamples.UserDAO;


@WebServlet("/LogInServlet")
public class LogInServlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession();
		
		
		boolean isValid = UserDAO.isUserValid(username, password);
	
		if(isValid)
		{
			response.sendRedirect("home.jsp?login=successfull&userName="+username);
			session.setAttribute("username", username);	
			
			
		}
		else
		{
			response.sendRedirect("index.jsp?login=failed");
		}
		
	}

}
