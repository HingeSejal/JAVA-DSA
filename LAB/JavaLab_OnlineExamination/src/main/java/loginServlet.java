import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");

        // Simple authentication
        if(username.equals("student") && password.equals("1234")) {

            // Create HttpSession
            HttpSession session = request.getSession();
            session.setAttribute("user", username);

            // Store exam time
            session.setAttribute("timeLeft", 30);

            // Remember Me cookie
            if(remember != null){
                Cookie userCookie = new Cookie("username", username);
                userCookie.setMaxAge(60*60*24*7); // 7 days
                response.addCookie(userCookie);
            }

            response.sendRedirect("exam.jsp");

        } else {

            response.getWriter().println("Invalid Login");

        }
    }
}
