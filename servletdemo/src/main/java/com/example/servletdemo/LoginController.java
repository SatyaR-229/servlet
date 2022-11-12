package com.example.servletdemo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("fname");
        String pass = req.getParameter("lname");
        log("we got the data of user information");
        Cookie ck = new Cookie("user1", name);
        resp.addCookie(ck);
        RequestDispatcher rd = req.getRequestDispatcher("data");
        rd.forward(req,resp);



    }
}







