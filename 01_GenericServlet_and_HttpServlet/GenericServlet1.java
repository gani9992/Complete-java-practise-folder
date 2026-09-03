import java.io.*;
import javax.servlet.*;

import javax.servlet.annotation.WebServlet;

@WebServlet("/generic")
public class GenericServlet1 extends GenericServlet {

    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.println("this is the generic servlet.!!");
    }
}
