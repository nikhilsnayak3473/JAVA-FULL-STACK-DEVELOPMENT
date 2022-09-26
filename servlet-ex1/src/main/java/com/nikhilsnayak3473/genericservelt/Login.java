package com.nikhilsnayak3473.genericservelt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login extends GenericServlet {

	static {
		System.out.println("loaded login");
	}
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		if (email.equals("nikhilsnayak3473@gmail.com") && password.equals("nikhil")) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.html");
			requestDispatcher.forward(req, res);
		} else {
			PrintWriter printWriter = res.getWriter();
			printWriter.print("Email/Password invaild");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.html");
			requestDispatcher.include(req, res);
		}
	}

}
