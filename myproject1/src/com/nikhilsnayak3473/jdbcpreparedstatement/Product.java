package com.nikhilsnayak3473.jdbcpreparedstatement;

public class Product {
	@Override
	public String toString() {
		return "\nProduct [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}

	private int id;
	private String name;
	private String brand;
	private double price;

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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
