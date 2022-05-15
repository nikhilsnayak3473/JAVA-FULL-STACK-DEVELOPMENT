package com.student;

public class StudentData {
	
	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + ", phone=" + phone + ", percentage=" + percentage
				+ ", branch=" + branch + "]\n";
	}
	private int id;
	private String name;
	private long phone;
	private float percentage;
	private String branch;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	

}
