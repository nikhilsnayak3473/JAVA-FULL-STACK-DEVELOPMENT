package com.student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) throws Exception {
		Student student = new Student();
		StudentData studentData = new StudentData();
		Scanner sc = new Scanner(System.in);

		int choice;
		while (true) {
			System.out.println("Enter your choice\n" + "1. Insert Student\n" + "2. Get all students\n"
					+ "3. Get student by ID\n" + "4. Update student details\n" + "5. Delete student\n" + "6. Exit");

			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the ID");
				int id = sc.nextInt();

				System.out.println("Enter the Name");
				String name = sc.next();

				System.out.println("Enter the Phone number");
				long phone = sc.nextLong();

				System.out.println("Enter the percentage");
				int percentage = sc.nextInt();

				System.out.println("Enter the branch");
				String branch = sc.next();

				studentData.setId(id);
				studentData.setName(name);
				studentData.setPhone(phone);
				studentData.setPercentage(percentage);
				studentData.setBranch(branch);

				student.insertStudent(studentData);
				System.out.println("Student added successfullly");

			}
			case 2: {
				ArrayList<StudentData> studentsList = student.getStudents();
				System.out.println(studentsList);
			}
			case 3: {
				System.out.println("Enter the Id of the Student");
				int id = sc.nextInt();
				studentData = student.getStudentById(id);
				System.out.println(studentData);
			}
			case 4: {
				
			}

			}
		}
//		
//		System.out.println("insert student");
//		
//		

//		System.out.println("update student");
//		student.updateStudent();
//		
//		System.out.println("student by id");
//		student.getStudentById();
//		
//		System.out.println("delete student");
//		student.deleteStudent();


//		student.close();
	}

}
