package com.steven.servletapp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;

public class FirstServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        String authType = request.getAuthType();
        String localAddress = request.getLocalAddr();
        String localName = request.getLocalName();
        int localPort = request.getLocalPort();

        Locale locale = request.getLocale();
        String contextPath = request.getContextPath();
        String method = request.getMethod();
        String pathInfo = request.getPathInfo();
        String pathTranslated = request.getPathTranslated();
        String protocol = request.getProtocol();
        String queryString = request.getQueryString();

        String remoteAddress = request.getRemoteAddr();

        int port = request.getRemotePort();
        String remoteUser = request.getRemoteUser();
        String requestedSessionId = request.getRequestedSessionId();

        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();

        String scheme = request.getScheme();

    }
}
