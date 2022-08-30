package basics;

import java.util.Scanner;

class Lucky {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        if (num % 5 == 0) {
            System.out.println("basics.Lucky");
        }
    }
}

