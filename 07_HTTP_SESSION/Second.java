import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/second")
public class Second extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter pw = res.getWriter();

        pw.println("this is second servlet..!!");
        HttpSession hp = req.getSession();
        pw.println(hp.getAttribute("name"));
        pw.println(hp.getAttribute("age"));
    }

}