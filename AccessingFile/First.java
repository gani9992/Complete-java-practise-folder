import javax.servlet.ServletException;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/first")
public class First extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String fileName = req.getParameter("f1"); // e.g. "C:/files/Advanced Java Lab.pdf"
        File file = new File(fileName);

        res.setContentType("application/pdf");
        res.setHeader("Content-Disposition", "inline; filename=\"" + file.getName() + "\"");

        try (FileInputStream fis = new FileInputStream(file);
                OutputStream os = res.getOutputStream()) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
        } catch (FileNotFoundException e) {
            res.setContentType("text/html");
            res.getWriter().println("<p style='color:red;'>File not found: " + fileName + "</p>");
        }
    }
}
