package com.nikhilsnayak3473.genericservelt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Register extends GenericServlet {
	static {
		System.out.println("loaded register");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		int age = Integer.parseInt(req.getParameter("age"));
		ServletContext servletContext = getServletContext();

		String greet = servletContext.getInitParameter("greet");
		
		ServletConfig servletConfig = getServletConfig();
		
		String status = servletConfig.getInitParameter("status");

		PrintWriter printWriter = res.getWriter();
		printWriter.print("<html>");
		printWriter.print("<head>");
		printWriter.print("<title>Registraion</title>");
		printWriter.print("</head>");
		printWriter.print("<body>");
		printWriter.print("<h1>Registration "+status+"</h1>");
		printWriter.print("<p>" + greet + "</p>");
		printWriter.print("<p>Your name is " + name + "</p>");
		printWriter.print("<p>Your Email is " + email + "</p>");
		printWriter.print("<p>Your Age is " + age + "</p>");
		printWriter.print("</body>");
		printWriter.print("</html>");

	}

}
