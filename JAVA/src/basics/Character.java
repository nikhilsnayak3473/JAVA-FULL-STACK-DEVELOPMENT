package basics;

import java.util.Scanner;

class Character {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a basics.Character");
        ch = sc.next().charAt(0);
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is number");
        } else {
            System.out.println(ch + " is a special basics.Character");
        }
    }
}

