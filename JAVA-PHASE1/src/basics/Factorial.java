package basics;

import java.util.Scanner;

public class Factorial {

    public static int getFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * getFactorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int factorial = 1;
        if (num < 0) {
            System.out.println("invalid input");
        } else {
            for (int i = num; i > 0; i--) {
                factorial *= i;
            }
            System.out.println(factorial);
        }

        System.out.println(getFactorial(num));

    }
}
