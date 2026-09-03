import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/first")
public class First extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter pw = res.getWriter();
        pw.append("this is firstServlet");
        RequestDispatcher rd=req.getRequestDispatcher("/second");
           rd.include(req,res);
        //    rd.forward(re q,
     
         // res.sendRedirect();
                }

}