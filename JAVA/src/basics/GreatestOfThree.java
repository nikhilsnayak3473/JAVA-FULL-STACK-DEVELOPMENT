package basics;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a>b&&a>c){
            System.out.println("A is greater");
        }else if (b>c){
            System.out.println("B is greater");
        }else {
            System.out.println("c is greater");
        }
    }
}
