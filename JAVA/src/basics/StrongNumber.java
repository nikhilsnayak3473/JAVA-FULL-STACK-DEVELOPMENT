package basics;

import java.util.Scanner;

public class StrongNumber {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int numberCopy = number;
        int number2 = 0;
        while (number!=0){
            number2+=Factorial.getFactorial(number%10);
            number/=10;
        }
        if (number2==numberCopy){
            System.out.println("Strong number");
        }else{
            System.out.println("not a strong number");
        }

    }
}
