package basics;

import java.util.Scanner;

public class NumberReverse {
    public static int getLength(long num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        int numberLength = getLength(number);
        int rem;
        long reversed = 0;
        while (number % 10 == 0) {
            System.out.print(0);
            number /= 10;
        }
        while (number != 0) {
            rem = (int) number % 10;
            reversed = reversed * 10 + rem;
            number /= 10;
        }

        int reversedLength = getLength(reversed);

        while (reversedLength != numberLength) {
            reversed *= 10;
            reversedLength++;
        }

        System.out.println(reversed);
    }
}
