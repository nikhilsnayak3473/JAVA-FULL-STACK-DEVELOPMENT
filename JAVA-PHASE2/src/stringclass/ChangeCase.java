package stringclass;

import java.util.Scanner;

public class ChangeCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String newString = "";

		System.out.println("Enter a string");
		String s = sc.next();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				newString += (s.charAt(i) + "").toLowerCase();
			} else {
				newString += (s.charAt(i) + "").toUpperCase();
			}
		}

		System.out.println(newString);
	}

}
