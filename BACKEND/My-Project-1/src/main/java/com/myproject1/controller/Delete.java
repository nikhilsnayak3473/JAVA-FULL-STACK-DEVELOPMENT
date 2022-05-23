package com.myproject1.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.myproject1.dao.UserDAO;


@WebServlet("/delete")
public class Delete extends GenericServlet{
@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	try {
		UserDAO userDAO = new UserDAO();

		int id = Integer.parseInt(req.getParameter("id"));

		userDAO.deleteUser(id);
		userDAO.close();

	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
	
}
}
