package oops.encapsulation;

import java.util.Scanner;

public class UserDriver {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		User user1 = new User();

		System.out.println("Enter the user id");
		user1.setId(scanner.nextInt());

		System.out.println("Enter the name");
		user1.setName(scanner.next());

		System.out.println("Enter the email");
		user1.setEmail(scanner.next());

		System.out.println("Enter the password");
		user1.setPassword(scanner.nextInt());

		System.out.println(user1.getUserDetails());
		
		System.out.println("Enter the new password");
		user1.setPassword(scanner.nextInt());
		
		System.out.println(user1.getUserDetails());
	}
}
