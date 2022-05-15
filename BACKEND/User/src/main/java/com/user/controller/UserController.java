package com.user.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.user.dao.UserDao;
import com.user.dto.User;

public class UserController {
	private static Scanner sc;

	public static void main(String[] args) throws Exception {
		User user = new User();
		UserDao userDao = new UserDao();
		sc = new Scanner(System.in);
		int choice;

		while (true) {
			System.out.println("Enter your choice\n" + "1. Add User\n" + "2. Get All Users\n" + "3. Get User By ID\n"
					+ "4. Update User\n" + "5. Remove User\n" + "6. Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the ID, Name, Phone Number of the User");
				user.setId(sc.nextInt());
				user.setName(sc.next());
				user.setPhone(sc.nextLong());
				userDao.addUser(user);
				System.out.println("User Added Successfully");
				break;

			}
			case 2: {
				ArrayList<User> usersList = userDao.getAllUsers();

				System.out.println("Details of All Users are:");
				System.out.println(usersList);
				break;
			}
			case 3: {
				System.out.println("Enter the ID of the User");
				int id = sc.nextInt();

				user = userDao.getUserById(id);

				System.out.println("Details of the user is:");
				System.out.println(user);
				break;
			}
			case 4: {
				System.out.println("Enter the ID of the User");
				int id = sc.nextInt();

				System.out.println("Enter the NEW Name and Phone Number");
				user.setName(sc.next());
				user.setPhone(sc.nextLong());

				userDao.updateUser(id, user);

				System.out.println("User Details Updated Succesfully");
				break;
			}
			case 5: {
				System.out.println("Enter the ID of the User");
				int id = sc.nextInt();

				userDao.removeUser(id);

				System.out.println("User Removed Successfully");
				break;
			}
			case 6: {
				userDao.close();
				System.exit(0);
			}

			default:
				System.out.println("Enter a vaild option");
			}

			System.out.println("-----------------------------------------------------------------------");
		}

	}
}
