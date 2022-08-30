package arrays_and_collections;

import java.util.Scanner;

public class BusMain {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Bus Number");
        String busNumber = sc.nextLine();
        System.out.println("Enter the Bus Name");
        String busName = sc.nextLine();
        Bus bus = new Bus(busNumber, busName);
        while (true) {
            System.out.println("Enter your choice\n" +
                    "1. Generate Ticket\n" +
                    "2. Cancel Ticket\n" +
                    "3. Update Arrival Place\n" +
                    "4. Update Departure Place\n" +
                    "5. View Ticket Details\n" +
                    "6. View all Tickets Details\n" +
                    "7. View Bus Details\n" +
                    "8. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    bus.generateTicket();
                    break;

                case 2:
                    bus.cancelTicket();
                    break;

                case 3:
                    bus.updateArrival();
                    break;
                case 4:
                    bus.updateDeparture();
                    break;

                case 5:
                    bus.viewTicketDetails();
                    break;

                case 6:
                    bus.viewAllTicketsDetails();
                    break;

                case 7:
                    System.out.println(bus);
                    break;

                case 8:
                    System.exit(0);

                default:
                    System.out.println("Enter a valid option");
            }
            System.out.println("--------------------------------------------------------------");
        }
    }
}
