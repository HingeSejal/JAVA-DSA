package com.jspmlabs;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String DB_URL =
        "jdbc:mysql://localhost:3306/javalab";
    private static final String DB_USER = "sejal";
    private static final String DB_PASS = "sejal@123";

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        boolean isValid = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASS);

            String query = "SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                isValid = true;
            }

            con.close();	

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Log login attempt
        logAttempt(username, isValid);

        if (isValid) {

            // Start session
            HttpSession session = request.getSession();
            session.setAttribute("user", username);

            response.sendRedirect("dashboard.jsp");

        } else {

            response.sendRedirect("loginPage.html?error=Invalid Credentials");
        }
    }

    private void logAttempt(String username, boolean status) {
        try {
            FileWriter fw = new FileWriter("login_log.txt", true);
            System.out.println(new java.io.File("login_log.txt").getAbsolutePath());
            fw.write("Time: " + LocalDateTime.now()
                    + " | User: " + username
                    + " | Status: "
                    + (status ? "SUCCESS" : "FAILURE")
                    + "\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
