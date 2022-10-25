package com.nhnacademy.servlet;

import javax.net.ssl.HandshakeCompletedEvent;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Login</h1>");

        out.println("</body>");
        if(session == null){
            resp.setContentType("text/html");
        }

        else {
            String id = (String) session.getAttribute("ID");
            session.setAttribute("ID", id);
            String password = (String) session.getAttribute("PWD");
            session.setAttribute("PWD", password);

        }

    }
}
