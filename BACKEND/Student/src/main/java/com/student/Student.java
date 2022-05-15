package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Student {
	Connection conn;

	Student() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/backend", "root", "root");
	}

	public void insertStudent(StudentData studentData) throws Exception {
		PreparedStatement st = conn.prepareStatement("insert into student values(?,?,?,?,?)");

		st.setInt(1, studentData.getId());
		st.setString(2, studentData.getName());
		st.setLong(3, studentData.getPhone());
		st.setFloat(4, studentData.getPercentage());
		st.setString(5, studentData.getBranch());

		st.execute();

		st.close();
	}

	public ArrayList<StudentData> getStudents() throws Exception {
		ArrayList<StudentData> studentsList = new ArrayList<StudentData>();
		PreparedStatement st = conn.prepareStatement("select * from student");
		ResultSet res = st.executeQuery();

		while (res.next()) {
			StudentData studentData = new StudentData();
			studentData.setId(res.getInt("id"));
			studentData.setName(res.getString("name"));
			studentData.setPhone(res.getLong("phone"));
			studentData.setPercentage(res.getInt("percentage"));
			studentData.setBranch(res.getString("branch"));
			studentsList.add(studentData);

		}
		st.close();
		return studentsList;
	}

	public StudentData getStudentById(int id) throws Exception {
		StudentData studentData = new StudentData();
		PreparedStatement st = conn.prepareStatement("select * from student where id=?");
		st.setInt(1, id);
		ResultSet res = st.executeQuery();
		while (res.next()) {
			studentData.setId(res.getInt("id"));
			studentData.setName(res.getString("name"));
			studentData.setPhone(res.getLong("phone"));
			studentData.setPercentage(res.getInt("percentage"));
			studentData.setBranch(res.getString("branch"));
		}
		st.close();
		return studentData;
	}

	public void updateStudent(int id, StudentData studentData) throws Exception {
		PreparedStatement st = conn.prepareStatement("update student set name=? percentage=? where id=?");
		st.setString(1, studentData.getName());
		st.setFloat(2, studentData.getPercentage());
		st.setInt(3, id);
		st.executeUpdate();
		st.close();
	}

	public void deleteStudent(int id) throws Exception {
		PreparedStatement st = conn.prepareStatement("delete from student where id=?");
		st.setInt(1, id);
		st.execute();
		st.close();
	}

	public void close() throws Exception {
		conn.close();
	}

}
