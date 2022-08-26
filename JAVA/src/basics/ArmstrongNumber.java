package basics;

import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int number) {
        int temp = number;
        int count = 0;
        int sum = 0;
        int prod;
        int rem;

        while (temp != 0) {
            count++;
            temp /= 10;
        }
        temp = number;
        while (temp != 0) {
            rem = temp % 10;
            prod = 1;
            for (int i = 0; i < count; i++) {
                prod *= rem;
            }
            sum += prod;
            temp /= 10;
        }

        return number == sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        if (isArmstrong(num)) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }
    }
}
