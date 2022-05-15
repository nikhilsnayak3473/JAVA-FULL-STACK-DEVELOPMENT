package com.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.user.dto.User;

public class UserDao {

	private Connection conn;

	public UserDao() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/backend", "root", "root");
	}

	public void addUser(User user) throws Exception {
		PreparedStatement st = conn.prepareStatement("insert into user values(?,?,?)");

		st.setInt(1, user.getId());
		st.setString(2, user.getName());
		st.setLong(3, user.getPhone());

		st.execute();
		st.close();
	}

	public ArrayList<User> getAllUsers() throws Exception {
		ArrayList<User> userslist = new ArrayList<User>();
		PreparedStatement st = conn.prepareStatement("select * from user");
		ResultSet res = st.executeQuery();

		while (res.next()) {
			User user = new User();
			user.setId(res.getInt("id"));
			user.setName(res.getString("name"));
			user.setPhone(res.getLong("phone"));
			userslist.add(user);
		}
		st.close();
		return userslist;
	}

	public User getUserById(int id) throws Exception {
		User user = new User();
		PreparedStatement st = conn.prepareStatement("select * from user where id=?");
		st.setInt(1, id);
		ResultSet res = st.executeQuery();
		while (res.next()) {
			user.setId(res.getInt("id"));
			user.setName(res.getString("name"));
			user.setPhone(res.getLong("phone"));
		}
		st.close();
		return user;
	}

	public void updateUser(int id, User user) throws Exception {
		PreparedStatement st = conn.prepareStatement("update user set name=? phone=? where id=?");

		st.setString(1, user.getName());
		st.setLong(2, user.getPhone());
		st.setInt(3, id);

		st.executeUpdate();
		st.close();
	}

	public void removeUser(int id) throws Exception {
		PreparedStatement st = conn.prepareStatement("delete from user where id=?");

		st.setInt(1, id);
		st.execute();
		st.close();

	}
	
	public void close() throws Exception {
		conn.close();
	}
}
