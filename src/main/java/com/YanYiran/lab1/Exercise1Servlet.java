package com.YanYiran.lab1;

//import jakarta.servlet.*;
//import jakarta.servlet.http.*;
//import jakarta.servlet.annotation.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Exercise1Servlet", value = "/exercise1")
public class Exercise1Servlet extends HttpServlet {
    int index;
    @Override
    public void init() throws ServletException {
        super.init();
        index=0;
        System.out.println("I Am from default constructor");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext();
        Integer index =(Integer)context.getAttribute("index");
        PrintWriter out =response.getWriter();
        if (index==null){
            index = new Integer(1);
        }else {
            index = new Integer(index.intValue()+1);
        }

        out.println("since loading ,this servlet has been accessed "+index+" times");

       context.setAttribute("index",index);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
