package com.codegnan.app.javawebapp11042026.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet({"/", "/home"})
//@WebServlet("/")
@WebServlet("/home")
public class SiteHomeServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body bgcolor = 'red'>");
		out.println("<h1>");
		out.println("Welcome to Site Home Page from java-webapp-11042026");
		out.println("</h1>");
		out.println("<a href = 'first'> Go to FirstServlet </a><br>");
		out.println("<a href = 'second'> Go to SecondServlet </a><br>");
		out.println("<a href = 'greeting.html'> Go to greeting.html </a>");
		out.println("</body>");
		out.println("</html>");
	}
}