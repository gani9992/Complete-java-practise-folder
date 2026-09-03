package com.example;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

// @WebServlet("/first")
public class FirstServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.println("this is normal servlet");
        ServletContext sc1 = getServletContext();
        ServletConfig sc2 = getServletConfig();
        pw.println(sc1.getInitParameter("name"));
        pw.println(sc2.getInitParameter("roll"));
    }
}
