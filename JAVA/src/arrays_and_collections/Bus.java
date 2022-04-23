package arrays_and_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Bus {
    String busNumber;
    String busName;
    int passengerCount=1;
    Ticket ticket;
    ArrayList<Ticket> ticketsList= new ArrayList<>();
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
        System.out.println("Enter the Passenger Name");
        String passengerName = sc.next();
        System.out.println("Enter Arrival Place");
        String arrivalPlace = sc.next();
        System.out.println("Enter Departure Place");
        String departurePlace = sc.next();
        ticket = new Ticket(busNumber+passengerCount,passengerName,arrivalPlace,departurePlace);
        ticketsList.add(ticket);
        System.out.println("Ticket booked Successfully\nTicket NUmber: "+busNumber+passengerCount);
        passengerCount++;
    }

    public void cancelTicket(){
        if (!ticketsList.isEmpty()){
            System.out.println("Enter Ticket Number");
            String ticketNumber = sc.next();
            for (Ticket ticket: ticketsList
                 ) {
                if (ticket.getTicketNumber().equals(ticketNumber)){
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
            String ticketNumber = sc.next();
            for (Ticket ticket: ticketsList
            ) {
                if (ticket.getTicketNumber().equals(ticketNumber)){
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
            String ticketNumber = sc.next();
            for (Ticket ticket: ticketsList
            ) {
                if (ticket.getTicketNumber().equals(ticketNumber)){
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
            String ticketNumber = sc.next();
            for (Ticket ticket: ticketsList
            ) {
                if (ticket.getTicketNumber().equals(ticketNumber)){
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
