package basics;


import java.util.Scanner;

public class DynamicReading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a > b) && (a > c) ? "a is greater" : (b > c) ? "b is greater" : "c is greater");
    }
}
