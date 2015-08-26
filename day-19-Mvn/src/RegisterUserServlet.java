

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbcexamples.UserDAO;

/**
 * Servlet implementation class RegisterUserServlet
 */
@WebServlet("/RegisterUserServlet")
public class RegisterUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usernName = request.getParameter("username");
		
		String password = request.getParameter("password");
		
		String emailID = request.getParameter("email");
		
		System.out.println("Received Username passowrd and email as "+ usernName + " : "+ password + " :  "+ emailID);
		
		int status = UserDAO.insertUser(usernName, password, emailID);
		
		
		if (status >0)
		{
			response.sendRedirect("register.jsp?status=success");
		}
		
		else
		{
			response.sendRedirect("register.jsp?status=error");
		}

		
	}

}
