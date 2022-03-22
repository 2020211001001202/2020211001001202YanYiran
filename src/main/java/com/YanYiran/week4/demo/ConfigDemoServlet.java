package com.YanYiran.week4.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ConfigDemoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = getServletConfig().getInitParameter("name");
        String studentId = getServletConfig().getInitParameter("studentId");
        System.out.println("name:"+name);
        System.out.println("studentId:"+studentId);
        response.setContentType("text/html");


        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>name:" + name + "</h1>");
        out.println("<h1>studentId:" + studentId + "</h1>");
        out.println("</body></html>");

    }
}
