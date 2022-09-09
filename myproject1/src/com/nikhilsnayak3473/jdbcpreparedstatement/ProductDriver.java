package com.nikhilsnayak3473.jdbcpreparedstatement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDriver {
	public static void main(String[] args) {
		int id, res;
		String name, brand;
		double price;
		Product product;
		List<Product> productsList;
		ProductCrud productCrud = new ProductCrud();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Enter your choice\n" + "1. Save product\n" + "2. Remove product\n"
					+ "3. Display all products details\n" + "4. Update product\n"
					+ "5. Display single product details\n" + "6. Save multiple products\n" + "7. Exit interface");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter product id");
				id = scanner.nextInt();
				System.out.println("Enter product name");
				name = scanner.next();
				System.out.println("Enter product brand");
				brand = scanner.next();
				System.out.println("Enter product price");
				price = scanner.nextDouble();

				product = new Product();

				product.setId(id);
				product.setName(name);
				product.setBrand(brand);
				product.setPrice(price);

				res = productCrud.saveProduct(product);
				if (res == -1 || res == 0) {
					System.out.println("Error occured");

				} else {
					System.out.println("Product Saved");
				}
				break;

			case 2:
				System.out.println("Enter the id of the product to be deleted ");
				id = scanner.nextInt();

				res = productCrud.removeProduct(id);

				if (res == -1) {
					System.out.println("Error occured");
				} else if (res == 0) {
					System.out.println("Product not found with id " + id);
				} else {
					System.out.println("Product Deleted");
				}
				break;
			case 3:
				productsList = productCrud.getAllProducts();
				if (productsList.size() == 0) {
					System.out.println("There are no products");
				} else {
					System.out.println(productsList);
				}
				break;
			case 4:
				System.out.println("Enter id of the product to be updated");
				id = scanner.nextInt();
				System.out.println("Enter product name");
				name = scanner.next();
				System.out.println("Enter product brand");
				brand = scanner.next();
				System.out.println("Enter product price");
				price = scanner.nextDouble();

				product = new Product();

				product.setName(name);
				product.setBrand(brand);
				product.setPrice(price);

				res = productCrud.updateProduct(id, product);
				if (res == -1) {
					System.out.println("Error occured");

				} else if (res == 0) {
					System.out.println("No product found with id " + id);
				} else {
					System.out.println("Product Updated");
				}
				break;
			case 5:
				System.out.println("Enter the id of the product");
				id = scanner.nextInt();
				product = productCrud.getProductById(id);

				if (product == null) {
					System.out.println("Product not found with id " + id);
				} else {
					System.out.println(product);
				}

				break;
			case 6:
				System.out.println("Enter no of products");
				int N = scanner.nextInt();
				productsList = new ArrayList<Product>();
				while (N-- != 0) {
					System.out.println("Enter product id");
					id = scanner.nextInt();
					System.out.println("Enter product name");
					name = scanner.next();
					System.out.println("Enter product brand");
					brand = scanner.next();
					System.out.println("Enter product price");
					price = scanner.nextDouble();

					product = new Product();

					product.setId(id);
					product.setName(name);
					product.setBrand(brand);
					product.setPrice(price);

					productsList.add(product);
				}

				int[] ress = productCrud.saveProducts(productsList);
				if (ress == null || ress.length == 0) {
					System.out.println("Error occured");

				} else {
					System.out.println("Product Saved");
				}

				break;

			case 7:
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Enter a vaild option");

			}
			System.out.println("=====================================");

		}

	}
}
