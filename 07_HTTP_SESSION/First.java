import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/first")
public class First extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter pw = res.getWriter();
        String name = req.getParameter("f1");
        String age = req.getParameter("f2");
        pw.println("we have send your data successfully now you can login..!!");
        HttpSession htp = req.getSession();

        htp.setAttribute("name", name);
        htp.setAttribute("age", age);

    }

}