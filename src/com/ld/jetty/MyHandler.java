package com.ld.jetty;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyHandler extends AbstractHandler {
        public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response)
                throws IOException, ServletException {
            response.setContentType("text/html;charset=utf-8");  
            response.setStatus(HttpServletResponse.SC_OK);  
            baseRequest.setHandled(true);  
            response.getWriter().println("<h1>Hello World</h1>");  
            response.getWriter().println("<li>Request url: " + target + "</li>");  
            response.getWriter().println("<li>Server port: " + request.getServerPort() + "</li>");  
        }  
    }  