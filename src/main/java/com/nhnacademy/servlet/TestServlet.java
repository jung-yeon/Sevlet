package com.nhnacademy.servlet;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class TestServlet extends HttpServlet {
//    private  static final Longger LONGGER = LoggerFactory.getLogger(TestServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException{
        String title = getServletConfig().getInitParameter("title");
        String name = getServletConfig().getInitParameter("name");
        resp.getWriter().println("hello " + title + " " + name);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("service");
        super.service(req, resp);
    }

    @Override
    public void destroy() {
        log.info("destroy");
        super.destroy();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        log.info("init");
        super.init(config);
    }
}
