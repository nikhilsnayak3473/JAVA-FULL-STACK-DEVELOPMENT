package arrays_and_collections;

import java.util.Scanner;
import java.util.TreeSet;

public class Bus {
    String busNumber;
    String busName;
    Ticket ticket;
    TreeSet<Ticket> ticketsList= new TreeSet<>();
    Scanner sc = new Scanner(System.in);

    public Bus(String busNumber, String busName) {
        this.busNumber = busNumber;
        this.busName = busName;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busNumber='" + busNumber + '\'' +
                ", busName='" + busName + '\'' +
                '}';
    }

    public void generateTicket(){
        System.out.println("Enter Ticket Number");
        int ticketNumber = sc.nextInt();
        System.out.println("Enter the Passenger Name");
        String passengerName = sc.next();
        System.out.println("Enter Arrival Place");
        String arrivalPlace = sc.next();
        System.out.println("Enter Departure Place");
        String departurePlace = sc.next();
        ticket = new Ticket(ticketNumber,passengerName,arrivalPlace,departurePlace);
        ticketsList.add(ticket);
    }

    public void cancelTicket(){
        if (!ticketsList.isEmpty()){
            System.out.println("Enter Ticket Number");
            int ticketNumber = sc.nextInt();
            for (Ticket ticket: ticketsList
                 ) {
                if (ticket.getTicketNumber()==ticketNumber){
                    ticketsList.remove(ticket);
                    System.out.println("Ticket removed successfully");
                    return;
                }
            }
            System.out.println("Ticket not found");
        }else {
            System.out.println("Ticket list empty");
        }
    }

    public void updateArrival(){
        if (!ticketsList.isEmpty()){
            System.out.println("Enter Ticket Number");
            int ticketNumber = sc.nextInt();
            for (Ticket ticket: ticketsList
            ) {
                if (ticket.getTicketNumber() == ticketNumber){
                    System.out.println("Enter new Arrival Place");
                    ticket.arrivalPlace = sc.next();
                    System.out.println("Arrival Place Updated  Successfully\nArrival Place: "+ticket.arrivalPlace);
                    return;
                }
            }
            System.out.println("Ticket not found");
        }else {
            System.out.println("Ticket list empty");
        }
    }

    public void updateDeparture(){
        if (!ticketsList.isEmpty()){
            System.out.println("Enter Ticket Number");
            int ticketNumber = sc.nextInt();
            for (Ticket ticket: ticketsList
            ) {
                if (ticket.getTicketNumber() == ticketNumber ){
                    System.out.println("Enter new Departure Place");
                    ticket.departurePlace = sc.next();
                    System.out.println("Departure Place Updated  Successfully\nDeparture Place: "+ticket.departurePlace);
                    return;
                }
            }
            System.out.println("Ticket not found");
        }else {
            System.out.println("Ticket list empty");
        }
    }

    public void viewTicketDetails(){
        if (!ticketsList.isEmpty()){
            System.out.println("Enter Ticket Number");
            int ticketNumber = sc.nextInt();
            for (Ticket ticket: ticketsList
            ) {
                if (ticket.getTicketNumber() == ticketNumber){
                    System.out.println(ticket);
                    return;
                }
            }
            System.out.println("Ticket not found");
        }else {
            System.out.println("Ticket list empty");
        }
    }

    public void viewAllTicketsDetails(){
        if (!ticketsList.isEmpty()){
            System.out.println(ticketsList);
        }else {
            System.out.println("Ticket list empty");
        }
    }
}
