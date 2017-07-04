package com.intellimed;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class XmlServlet
 */

// Configure this one via web.xml instead of annotations!
public class XmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XmlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("XML Servlet's doGet method has been invoked!");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		//out.print("Hello from the GET method " + userName);
		
		out.print("<br>Request parameter has user name as " + userName);
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		
		if(userName != "" && userName != null){
			session.setAttribute("savedUserName", userName);
			context.setAttribute("savedUserName", userName);
		}
		out.print("<br>Session parameter has user name as " + (String) session.getAttribute("savedUserName"));
		out.print("<br>Context parameter has user name as " + (String) context.getAttribute("savedUserName"));

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");

		out.print("Hello from the POST method " + userName + "! We know your full name is " + fullName);
		
		String prof = request.getParameter("prof");
		out.print("<br>You work as " + prof);
		
		//String location = request.getParameter("location");
		String[] location = request.getParameterValues("location");
		out.print("<br>You are at " + location.length + " location(s)");
		for (int i = 0; i<location.length; i++){
			out.print("<br>   " + i + "   " + location[i]);
		}

	}

}
