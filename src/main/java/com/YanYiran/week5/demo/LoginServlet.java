package com.YanYiran.week5.demo;

import com.YanYiran.dao.UserDao;
import com.YanYiran.model.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    Connection con=null;

    @Override
    public void init() throws ServletException{
        super.init();
        /*ServletContext context=getServletContext();
        String driver=context.getInitParameter("driver");
        String url=context.getInitParameter("url");
        String username=context.getInitParameter("username");
        String password=context.getInitParameter("password");


        try {
            Class.forName(driver);
            con= DriverManager.getConnection(url,username,password);
            System.out.println("Connection --> in JDBCDemoServlet"+con);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }*/
        con= (Connection) getServletContext().getAttribute("con");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Connection --> "+con);
        request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter writer = response.getWriter();

        UserDao userDao=new UserDao();

        try {
            User user= userDao.findByUsernamePassword(con,username,password);
                if (user!=null){

                    /*Cookie c=new Cookie("sessionid",""+user.getId());
                    c.setMaxAge(10*60);
                        response.addCookie(c);*/


                    String rememberMe=request.getParameter("rememberMe");
                    if(rememberMe!=null && rememberMe.equals("1")){
                        Cookie usernameCookie=new Cookie("cUsername",user.getUsername());
                        Cookie passwordCookie=new Cookie("cPassword",user.getPassword());
                        Cookie rememberMeCookie=new Cookie("cRememberMe",rememberMe);

                        usernameCookie.setMaxAge(5);
                        passwordCookie.setMaxAge(5);
                        rememberMeCookie.setMaxAge(5);

                        response.addCookie(usernameCookie);
                        response.addCookie(passwordCookie);
                        response.addCookie(rememberMeCookie);
                    }

                    HttpSession session= request.getSession();
                    System.out.println("session id-->"+session.getId());
                    session.setMaxInactiveInterval(10);

                    session.setAttribute("user",user);
                    request.getRequestDispatcher("WEB-INF/views/userInfo.jsp").forward(request,response);
            }else{
                    request.setAttribute("message","Username or password Error!!");
                    request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request,response);

                }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }



        /*try {
            String sql = "select * from usertable where username=? and password=?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                //writer.println("<h1>Login Success!!!</h1>");
                //writer.println("<h1>Welcome" + username + "</h1>");

                request.setAttribute("id", resultSet.getInt("id"));
                request.setAttribute("username", resultSet.getString("username"));
                request.setAttribute("password", resultSet.getString("password"));
                request.setAttribute("email", resultSet.getString("email"));
                request.setAttribute("gender", resultSet.getString("gender"));
                request.setAttribute("birthDate", resultSet.getString("birthDate"));

                request.getRequestDispatcher("userInfo.jsp").forward(request,response);

            } else {
                //writer.println("<h1>Login Error!!!</h1>");
                request.setAttribute("message","Username or password Error!!");
                request.getRequestDispatcher("login.jsp").forward(request,response);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }}
