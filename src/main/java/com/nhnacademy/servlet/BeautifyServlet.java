package com.nhnacademy.servlet;

import org.jsoup.Jsoup;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

public class BeautifyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String html = req.getParameter("html");

        resp.setContentType("text/plain");

        resp.getWriter().println(Jsoup.parse(html));
        Integer counter = Optional.ofNullable((Integer)getServletContext().getAttribute("count")).orElse(0);

        getServletContext().setAttribute("count : ", ++counter );

    }
}
