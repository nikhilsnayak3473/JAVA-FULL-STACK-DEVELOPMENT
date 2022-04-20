package inheritance;

import java.util.Scanner;

public class OlaMain {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        Ola o = new Ola();
        while (true) {
            System.out.println("-------------Enter your choice-------------\n" +
                    "1. Book Cab\n" +
                    "2. Cancel Cab\n" +
                    "3. View Cab Details\n" +
                    "4. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    o.bookCab();
                    break;
                case 2:
                    o.cancelCab();
                    break;
                case 3:
                    o.viewCabDetails();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Enter a valid option");
            }
            System.out.println("-------------------------------------");
        }
    }
}
