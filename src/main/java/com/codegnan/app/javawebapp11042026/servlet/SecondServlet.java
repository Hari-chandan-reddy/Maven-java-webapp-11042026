package com.codegnan.app.javawebapp11042026.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class SecondServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body bgcolor = 'pink'>");
		out.println("<h1>");
		out.println("Welcome to SecondServlet from java-webapp-11042026");
		out.println("</h1>");
		out.println("<a href = 'first'> Go to FirstServlet </a><br>");
		out.println("<a href = 'greeting.html'> Go to greeting.html </a><br>");
		out.println("<a href = 'home'> Go to Site Home Page</a>");
		out.println("</body>");
		out.println("</html>");
	}
}
