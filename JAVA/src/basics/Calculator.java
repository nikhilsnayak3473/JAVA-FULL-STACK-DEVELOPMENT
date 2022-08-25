package basics;

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
//        int a = 100, b = 20, res;
//        System.out.println("a:" + a + " b:" + b);
//        res = add(a, b);
//        System.out.println("addition: " + res);
//        res = sub(a, b);
//        System.out.println("subtraction: " + res);
//        res = mul(a, b);
//        System.out.println("multiplication: " + res);
//        res = div(a, b);
//        System.out.println("division: " + res);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation to be performed");
        char operator = sc.next().charAt(0);
        System.out.println("Enter the operand1");
        int operand1 = sc.nextInt();
        System.out.println("Enter the operand2");
        int operand2 = sc.nextInt();
        switch (operator){
            case '+':
                System.out.println(operand1+operand2);
                break;
            case '-':
                System.out.println(operand1-operand2);
                break;
            case '*':
                System.out.println(operand1*operand2);
                break;
            case '/':
                System.out.println((float) (operand1/ operand2));
                break;
            default:
                System.out.println("Enter a valid operator");
        }


    }

/*
    private static int add(int a, int b) {
        return a + b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }

    private static int mul(int a, int b) {
        return a * b;
    }

    private static int div(int a, int b) {
        return a / b;
    }
*/
}
