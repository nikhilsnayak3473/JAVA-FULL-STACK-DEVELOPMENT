package com.nikhilsnayak3473.schoolapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.jsp");
		requestDispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		if (req.getParameter("email").equals("nikhilsnayak3473@gmail.com")
				&& req.getParameter("password").equals("nikhil")) {
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("auth-token", "12345");
			Cookie cookie = new Cookie("auth-cookie", "12345");
			resp.addCookie(cookie);
			resp.sendRedirect("home");

		} else {
			PrintWriter printWriter = resp.getWriter();
			printWriter.print("Email/Password incorrect");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.jsp");
			requestDispatcher.include(req, resp);
		}
	}

}
