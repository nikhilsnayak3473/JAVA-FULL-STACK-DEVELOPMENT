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

@WebServlet(value = "/update")
public class UpdateStudent extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		int id = Integer.parseInt(req.getParameter("id"));
		
		StudentCrud studentCrud = new StudentCrud();
		
		Student student = studentCrud.getStudentById(id);
		
		if(student!=null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("update.jsp");
			req.setAttribute("student", student);
			requestDispatcher.forward(req, resp);
		}else {
			PrintWriter printWriter = resp.getWriter();
			printWriter.print("No student found with specified id");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		Student student = new Student();
		student.setName(req.getParameter("name"));
		student.setEmail(req.getParameter("email"));
		student.setPhone(Long.parseLong(req.getParameter("phone")));
		
		StudentCrud studentCrud = new StudentCrud();
		student = studentCrud.updateStudent(id, student);
		
		if(student != null) {
			resp.sendRedirect("student_list");
		}else {
			PrintWriter printWriter = resp.getWriter();
			printWriter.print("Student not found with specified id");
		}
	}

}
