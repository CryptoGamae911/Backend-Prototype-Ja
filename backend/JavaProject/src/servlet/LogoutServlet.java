package servlet;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();  // Invalidate the session
        response.getWriter().write("Logout successful");
    }
}

