package stringclass;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String value");
		String s = sc.next();

		String reversed = "";

		long start1 = System.nanoTime();

		for (int i = s.length() - 1; i >= 0; i--) {
			reversed = reversed + s.charAt(i);

		}
		long end1 = System.nanoTime();

		System.out.println(end1 - start1);
		StringBuffer reversed2 = new StringBuffer();

		long start2 = System.nanoTime();

		for (int i = s.length() - 1; i >= 0; i--) {
			reversed2.append(s.charAt(i));

		}
		long end2 = System.nanoTime();

		System.out.println(end2 - start2);

		System.out.println(reversed);

	}
}
