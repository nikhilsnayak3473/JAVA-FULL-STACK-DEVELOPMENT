package com.nikhilsnayak3473.ioc;

public class Student {
	
	int id;
	String name;
	String email;
	
	
	
	public Student(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}



	void study() {
		System.out.println("Studying....");
	}

}
