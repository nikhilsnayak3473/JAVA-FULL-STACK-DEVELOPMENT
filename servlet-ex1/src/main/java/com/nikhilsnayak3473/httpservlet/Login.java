package com.nikhilsnayak3473.httpservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginv2")
public class Login extends HttpServlet {
	
	

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		String email = req.getParameter("email");
		String password = req.getParameter("password");
		ServletContext servletContext = getServletContext();

		String greet = servletContext.getInitParameter("greet");

		if (email.equals("nikhilsnayak3473@gmail.com") && password.equals("nikhil")) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.html");
			requestDispatcher.forward(req, resp);
		} else {
			PrintWriter printWriter = resp.getWriter();
			printWriter.print(greet+" Email/Password invaild");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.html");
			requestDispatcher.include(req, resp);
		}
	}

}
