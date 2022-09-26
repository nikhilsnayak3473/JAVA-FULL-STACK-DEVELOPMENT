package com.nikhilsnayak3473.schoolapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nikhilsnayak3473.schoolapp.dao.StudentCrud;
import com.nikhilsnayak3473.schoolapp.dto.Student;

@WebServlet(value = "/student_list")
public class DisplayStudentsList extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		StudentCrud studentCrud = new  StudentCrud();
		
		List<Student> students = studentCrud.getAllStudnets();
		
		if (students.size()>0) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("student_list.jsp");
			req.setAttribute("students", students);
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
			PrintWriter printWriter = resp.getWriter();
			printWriter.print("No Students Found");
			requestDispatcher.include(req, resp);

		}
		
		
	}

}
