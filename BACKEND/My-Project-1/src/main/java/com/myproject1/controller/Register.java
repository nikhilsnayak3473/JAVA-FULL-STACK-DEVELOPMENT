package com.myproject1.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.myproject1.dao.UserDAO;
import com.myproject1.dto.User;

@WebServlet("/register")
public class Register extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		try {
			User user = new User();
			UserDAO userDAO = new UserDAO();

			user.setId(Integer.parseInt(req.getParameter("id")));
			user.setName(req.getParameter("name"));
			user.setAge(Integer.parseInt(req.getParameter("age")));
			user.setPhoneNumber(Long.parseLong(req.getParameter("phoneNumber")));
			user.setEmailID(req.getParameter("emailID"));

			userDAO.insertUser(user);

			userDAO.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}
}
