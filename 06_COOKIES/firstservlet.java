import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.reflect.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/first")
public class firstservlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        Cookie c = new Cookie("name", "gani_shaik");
        response.addCookie(c);
        pw.println("this is servlet 1");

    }
}
