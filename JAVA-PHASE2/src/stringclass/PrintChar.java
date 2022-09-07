package stringclass;

import java.util.Scanner;

public class PrintChar {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String value");
	String s = sc.next();
	
//	String reversed = "";
//	
//	for(int i=s.length()-1;i>=0;i--) {
//		reversed = reversed + s.charAt(i);
//		
//	}
//	System.out.println(reversed);
	
	int repeated = 0;
	
	System.out.println("Enter a character");
	char ch = sc.next().charAt(0);
	
	for(int i=0;i<s.length();i++) {
		if(ch == s.charAt(i)) {
			repeated++;
		}
	}
	System.out.println(repeated);
}
}
