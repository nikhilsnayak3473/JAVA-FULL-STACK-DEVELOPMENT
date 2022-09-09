package com.nikhilsnayak3473.jdbcpreparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class ProductCrud {

	public int saveProduct(Product product) {
		Connection conn = null;
		try {
			Driver driver = new Driver(); // load driver
			DriverManager.registerDriver(driver); // register driver
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_second", "root", "root");
			PreparedStatement st = conn.prepareStatement("insert into product values(?,?,?,?)");
			st.setInt(1, product.getId());
			st.setString(2, product.getName());
			st.setString(3, product.getBrand());
			st.setDouble(4, product.getPrice());

			return st.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return -1;
	}

	public int[] saveProducts(List<Product> productList) {
		Connection conn = null;
		try {
			Driver driver = new Driver(); // load driver
			DriverManager.registerDriver(driver); // register driver
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_second", "root", "root");
			PreparedStatement st = conn.prepareStatement("insert into product values(?,?,?,?)");

			for (Product product : productList) {
				st.setInt(1, product.getId());
				st.setString(2, product.getName());
				st.setString(3, product.getBrand());
				st.setDouble(4, product.getPrice());
				st.addBatch();
			}
			return st.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public int removeProduct(int id) {
		Connection conn = null;
		try {
			Driver driver = new Driver(); // load driver
			DriverManager.registerDriver(driver); // register driver
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_second", "root", "root");
			PreparedStatement st = conn.prepareStatement("delete from product where id=?");
			st.setInt(1, id);
			return st.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return -1;
	}

	public int updateProduct(int id, Product product) {
		Connection conn = null;
		try {
			Driver driver = new Driver(); // load driver
			DriverManager.registerDriver(driver); // register driver
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_second", "root", "root");
			PreparedStatement st = conn.prepareStatement("update product set name=?,brand=?,price=? where id=?");
			st.setString(1, product.getName());
			st.setString(2, product.getBrand());
			st.setDouble(3, product.getPrice());
			st.setInt(4, id);
			return st.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return -1;
	}

	public Product getProductById(int id) {
		Connection conn = null;
		try {
			Driver driver = new Driver(); // load driver
			DriverManager.registerDriver(driver); // register driver
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_second", "root", "root");
			PreparedStatement st = conn.prepareStatement("select * from product where id=?");
			st.setInt(1, id);
			ResultSet res = st.executeQuery();
			if (res.next()) {
				Product product = new Product();
				product.setId(res.getInt("id"));
				product.setName(res.getString("name"));
				product.setBrand(res.getString("brand"));
				product.setPrice(res.getDouble("price"));
				return product;
			} else {
				return null;
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public List<Product> getAllProducts() {
		Connection conn = null;
		List<Product> productsList = new ArrayList<Product>();
		try {
			Driver driver = new Driver(); // load driver
			DriverManager.registerDriver(driver); // register driver
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_second", "root", "root");

			Statement st = conn.createStatement();

			ResultSet res = st.executeQuery("select * from product");
			while (res.next()) {
				Product product = new Product();
				product.setId(res.getInt("id"));
				product.setName(res.getString("name"));
				product.setBrand(res.getString("brand"));
				product.setPrice(res.getDouble("price"));
				productsList.add(product);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return productsList;
	}

}
