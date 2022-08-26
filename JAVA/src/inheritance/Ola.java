package inheritance;

import java.util.Scanner;

public class Ola {
    Cab c;
    Scanner sc = new Scanner(System.in);

    public void bookCab() {
        if (c == null) {
            System.out.print("From: ");
            String from = sc.next();
            System.out.print("To: ");
            String to = sc.next();
            System.out.println("Choose a vehicle\n" +
                    "1. Mini\n" +
                    "2. Prime\n" +
                    "3.Seden");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    c = new Mini(from, to, 150);
                    System.out.println("Mini cab booked successfully");
                    break;
                case 2:
                    c = new Prime(from, to, 200);
                    System.out.println("Prime cab booked successfully");
                    break;
                case 3:
                    c = new Seden(from, to, 180);
                    System.out.println("Seden cab booked successfully");
                    break;
                default:
                    System.out.println("Please choose a valid option");
            }
        } else {
            System.out.println("Cab is already booked");
        }
    }

    public void cancelCab() {
        if (c instanceof Mini) {
            c = null;
            System.out.println("Mini cab cancelled successfully");
        } else if (c instanceof Prime) {
            c = null;
            System.out.println("Prime cab cancelled successfully");
        } else if (c instanceof Seden) {
            c = null;
            System.out.println("Seden cab cancelled successfully");
        } else {
            System.out.println("No cab booked");
        }
    }

    public void viewCabDetails() {
        if (c instanceof Mini) {
            Mini m = (Mini) c;
            System.out.println("-------Mini Cab Details-------");
            System.out.println("From: " + m.from);
            System.out.println("To: " + m.to);
            System.out.println("Price: " + m.price);
        } else if (c instanceof Prime) {
            Prime p = (Prime) c;
            System.out.println("-------Prime Cab Details-------");
            System.out.println("From: " + p.from);
            System.out.println("To: " + p.to);
            System.out.println("Price: " + p.price);
        } else if (c instanceof Seden) {
            Seden s = (Seden) c;
            System.out.println("-------Seden Cab Details-------");
            System.out.println("From: " + s.from);
            System.out.println("To: " + s.to);
            System.out.println("Price: " + s.price);
        } else {
            System.out.println("No cab booked");
        }
    }
}
