package com.myproject1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.myproject1.dto.User;

public class UserDAO {
	Connection conn;

	public UserDAO() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost/backend", "root", "root");
	}

	public void insertUser(User user) throws Exception {
		PreparedStatement st = conn.prepareStatement("insert into user values(?,?,?,?,?)");
		st.setInt(1, user.getId());
		st.setString(2, user.getName());
		st.setInt(3, user.getAge());
		st.setLong(4, user.getPhoneNumber());
		st.setString(5, user.getEmailID());

		st.execute();
		st.close();
	}

	public void updateUser(User user) throws Exception {
		PreparedStatement st = conn.prepareStatement("update user set name=? , age=? ,phone=?, email=? where id=?");

		st.setString(1, user.getName());
		st.setInt(2, user.getAge());
		st.setLong(3, user.getPhoneNumber());
		st.setString(4, user.getEmailID());
		st.setInt(5, user.getId());

		st.executeUpdate();
		st.close();
	}

	public void deleteUser(int id) throws Exception {
		PreparedStatement st = conn.prepareStatement("delete from user where id=?");
		st.setInt(1, id);

		st.execute();
		st.close();
	}

	public void close() throws Exception {
		conn.close();
	}

}
