package basics;

import java.util.Scanner;

public class XylemAndPhloem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int temp = number;
        int last = temp % 10;
        int first = 0;
        int sum = 0;
        while (temp != 0) {
            first = temp % 10;
            temp /= 10;
        }
        temp = number;
        while (temp != 0) {
            sum += (temp % 10);
            temp /= 10;
        }

        int num1 = first + last;
        sum = sum - num1;

        if (sum == num1) {
            System.out.println("Xylem number");
        } else {
            System.out.println("Phloem number");
        }


    }
}
