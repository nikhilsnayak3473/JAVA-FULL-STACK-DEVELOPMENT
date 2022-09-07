package stringclass;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String value");
		String s = sc.next();

		String reversed = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reversed = reversed + s.charAt(i);

		}

		if (reversed.equals(s)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not a palindrome");
		}
		
		sc.close();
	}
}
