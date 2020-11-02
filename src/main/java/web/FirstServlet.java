package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "cs", urlPatterns = { "/" })
public class FirstServlet extends HttpServlet {
    private static final long serialVersionUID = 1825023232864573043L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom = req.getParameter("nom");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + nom + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
