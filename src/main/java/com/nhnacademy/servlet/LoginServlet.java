package com.nhnacademy.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@Slf4j
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if(Objects.isNull(session)){
            RequestDispatcher rd = req.getRequestDispatcher("/login");
            rd.forward(req, resp);
//            resp.sendRedirect("/login.html");
        }else{
            RequestDispatcher rd = req.getRequestDispatcher("/login");
            rd.forward(req, resp);
//            resp.setContentType("text/html");
            try (PrintWriter out = resp.getWriter()) {
                out.println("login success: id=" + session.getAttribute("id") + "<br />");
                out.println("<a href='/logout'>logout</a>");
            } catch (IOException ex) {
                log.error("", ex);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String initParamId = getServletConfig().getInitParameter("ID");
        String initParamPwd = getServletConfig().getInitParameter("PWD");

        String id = req.getParameter("ID");
        String pwd = req.getParameter("PWD");

        if(initParamId.equals(id) && initParamPwd.equals(pwd)){
            HttpSession session = req.getSession();
            session.setAttribute("ID",id);
            //게속 빙빙 돌기 때문에 실행이 안됨
            RequestDispatcher rd = req.getRequestDispatcher("/login");
            rd.forward(req, resp);
//            resp.sendRedirect("/login");
        }else{
            RequestDispatcher rd = req.getRequestDispatcher("/login");
            rd.forward(req, resp);
//            resp.sendRedirect("/login.html");
        }
    }
}
