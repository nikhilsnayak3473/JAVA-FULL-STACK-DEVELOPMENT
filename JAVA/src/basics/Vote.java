package basics;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age  = scanner.nextInt();
        if (age>=18){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }
}
