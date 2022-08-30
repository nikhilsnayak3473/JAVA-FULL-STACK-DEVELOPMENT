package basics;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int percentage = scanner.nextInt();
        if (percentage >= 80) {
            System.out.println("Topper");
        } else if (percentage >= 60) {
            System.out.println("Average");
        } else {
            System.out.println("legend");
        }

    }
}
