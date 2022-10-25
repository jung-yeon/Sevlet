//package com.nhnacademy.servlet;
//
//import lombok.extern.slf4j.Slf4j;
//
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import static java.lang.System.out;
//
//@Slf4j
//public class ServletContextServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ServletContext servletContext = new ServletContext
//       resp.setContentType("text/plain");
//        try{
//            out.println(servletContext.getContextPath());
//            out.println( servletContext.getMajorVersion());
//            out.println(servletContext.getMinorVersion());
//            out.println(servletContext.getEffectiveMajorVersion());
//            out.println(servletContext.getEffectiveMinorVersion());
//            out.println(servletContext.getRealPath("/context"));
//
//        }catch (IOException e){
//            log.error("",e)
//        }
//        getServletConfig().getServletContext();
//    }
//
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//
//    }
//}
