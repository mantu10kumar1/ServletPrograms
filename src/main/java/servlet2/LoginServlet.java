package servlet2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")




public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    // Simulating a user store with a single user for simplicity
    private final String USERNAME = "admin";
    private final String PASSWORD = "password123";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		   String username = request.getParameter("username");
	        String password = request.getParameter("password");

	        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
	            // Successful login
	            HttpSession session = request.getSession();
	            session.setAttribute("username", username);
	            response.sendRedirect("welcome");
	        } 
//	        else {
//	            // Failed login
//	            response.setContentType("text/html");
//	            PrintWriter out = response.getWriter();
//	            out.println("<html><body>");
//	            out.println("<h3>Invalid username or password</h3>");
//	            out.println("<a href='login.html'>Try again</a>");
//	            out.println("</body></html>");
//
//	        }
	     
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
