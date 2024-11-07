package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class CalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String operation = request.getParameter("operation");
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        double result = 0;
        
        if ("add".equals(operation)) {
            result = num1 + num2;
        } else if ("subtract".equals(operation)) {
            result = num1 - num2;
        } else if ("multiply".equals(operation)) {
            result = num1 * num2;
        } else if ("divide".equals(operation)) {
            result = num1 / num2;
        }
        
        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Result: " + result + "</h1>");
        response.getWriter().println("<a href='index.jsp'>Back to Calculator</a>");
        response.getWriter().println("</body></html>");
    }
}

