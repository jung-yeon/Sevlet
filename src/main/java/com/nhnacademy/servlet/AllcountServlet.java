package com.nhnacademy.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AllcountServlet extends HttpServlet {
    public int count;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("count : " + ++count);


    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        count = Integer.parseInt(config.getInitParameter("count"));
        super.init(config);
    }
}
