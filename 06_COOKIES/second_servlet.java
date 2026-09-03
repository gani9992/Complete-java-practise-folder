import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.reflect.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/second")
public class second_servlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();

        pw.println("this is servlet 2");
        Cookie c[] = request.getCookies();

        pw.println(c[0].getValue());

    }
}
