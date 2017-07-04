package com.intellimed;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A simple servlet", urlPatterns = { "/SimpleServletPath" },
		initParams={@WebInitParam(name="defaultUserName", value="John Doe")})
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from SimpleServlet's doGet method!");
		PrintWriter writer = response.getWriter();
		writer.print("<h3>Hello in HTML</h3>");
		writer.print("<br> Init parameter has a default user name value of " + this.getServletConfig().getInitParameter("defaultUserName"));
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());

	}

}
