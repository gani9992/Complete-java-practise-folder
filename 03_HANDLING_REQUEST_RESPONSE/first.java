import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;
@WebServlet("/first")
public class first extends HttpServlet{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
PrintWriter pw=res.getWriter();
String a1=req.getParameter("f1");
pw.print("the value you entered is: "+a1);
}
}