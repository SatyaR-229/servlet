package com.example.servletdemo;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginData extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("fname");
        String pass = req.getParameter("lname");

        Cookie ck1[] = req.getCookies();
        if (ck1[0].getName() == name) {
            out.println("Welcome Back" + name);
        } else {
            out.println("Welcome" + name);

        }
    }
}
