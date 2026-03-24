import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FeedbackServlet")
public class FeedbackServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        // Retrieve form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String rating = request.getParameter("rating");
        String comments = request.getParameter("comments");

        // Store feedback (console log)
        System.out.println("----- New Feedback -----");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Rating: " + rating);
        System.out.println("Comments: " + comments);

        // Response to client
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Thank you, " + name + "!</h2>");
        out.println("<p>Your feedback has been received.</p>");
        out.println("</body></html>");
    }
}
