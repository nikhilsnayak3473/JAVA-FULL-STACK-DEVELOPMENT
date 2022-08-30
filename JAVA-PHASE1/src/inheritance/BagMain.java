package inheritance;

import java.util.Scanner;

public class BagMain {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        Bag b = new Bag();
        while (true) {
            System.out.println("-------------Enter your choice-------------\n" +
                    "1. Add ball\n" +
                    "2. Remove Ball\n" +
                    "3. Check Bag\n" +
                    "4. Show Game\n" +
                    "5. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    b.addBall();
                    break;
                case 2:
                    b.removeBall();
                    break;
                case 3:
                    b.isBagEmpty();
                    break;
                case 4:
                    b.showGame();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Enter a valid option");
            }
            System.out.println("-------------------------------------");
        }
    }
}
