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

@WebServlet(value = "/remove")
public class RemoveStudent extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		int id = Integer.parseInt(req.getParameter("id"));
		StudentCrud studentCrud = new StudentCrud();
		
		boolean deleted = studentCrud.removeStudent(id);
		
		if(deleted) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("student_list");
			requestDispatcher.forward(req, resp);
		}else {
			PrintWriter printWriter = resp.getWriter();
			printWriter.print("No student with specified Id");
		}
	}

}
