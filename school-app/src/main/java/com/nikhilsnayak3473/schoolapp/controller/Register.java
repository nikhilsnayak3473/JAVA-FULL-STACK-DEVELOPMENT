package com.nikhilsnayak3473.schoolapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nikhilsnayak3473.schoolapp.dao.StudentCrud;
import com.nikhilsnayak3473.schoolapp.dto.Student;

@WebServlet(value = "/register")
public class Register extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("register.jsp");
		requestDispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		Student student = new Student();

		student.setName(req.getParameter("name"));
		student.setEmail(req.getParameter("email"));
		student.setPhone(Long.parseLong(req.getParameter("phone")));

		StudentCrud studentCrud = new StudentCrud();
		PrintWriter printWriter = resp.getWriter();
		student = studentCrud.addStudent(student);
		if (student != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("registration_confirmation.jsp");
			req.setAttribute("id", student.getId());
			requestDispatcher.forward(req, resp);

		} else {
			printWriter.print("Registration Failed try again");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("register.jsp");
			requestDispatcher.include(req, resp);
		}

	}

}
