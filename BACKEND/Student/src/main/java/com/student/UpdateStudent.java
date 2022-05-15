package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateStudent {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/backend", "root", "root");
		PreparedStatement nameSt = conn.prepareStatement("update student set name=? where id=?");
		PreparedStatement phoneSt = conn.prepareStatement("update student set phone=? where id=?");
		PreparedStatement percentageSt = conn.prepareStatement("update student set percentage=? where id=?");
		PreparedStatement branchSt = conn.prepareStatement("update student set branch=? where id=?");
		System.out.println("Enter the id of the student");
		int id = sc.nextInt();
		System.out.println("Enter your choice for updation\n"
				+ "1. Name\n"
				+ "2. Phone Number\n"
				+ "3. percentage\n"
				+ "4. branch\n");
		int choice = sc.nextInt();
		switch(choice) {
			case 1: nameSt.setInt(2, id);
					System.out.println("Enter the new Name");
					String name = sc.next();
					nameSt.setString(1, name);
					nameSt.executeUpdate();
					nameSt.close();
					break;
			case 2: phoneSt.setInt(2, id);
					System.out.println("Enter the new Phone Number");
					long phone = sc.nextLong();
					phoneSt.setLong(1, phone);
					phoneSt.executeUpdate();
					phoneSt.close();
					break;
			case 3: percentageSt.setInt(2, id);
					System.out.println("Enter the new Percentage");
					float percentage = sc.nextFloat();
					percentageSt.setFloat(1, percentage);
					percentageSt.executeUpdate();
					percentageSt.close();
					break;
			case 4: branchSt.setInt(2, id);
					System.out.println("Enter the new Branch");
					String branch = sc.next();
					branchSt.setString(1, branch);
					branchSt.executeUpdate();
					branchSt.close();
					break;
			default:System.out.println("invaild option");
		}
		conn.close();
	}
}
