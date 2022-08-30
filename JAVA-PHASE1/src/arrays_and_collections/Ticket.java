package arrays_and_collections;


public class Ticket implements Comparable<Ticket> {
    private final int ticketNumber;
    String passengerName;
    String arrivalPlace;
    String departurePlace;

    public Ticket(int ticketNumber, String passengerName, String arrivalPlace, String departurePlace) {
        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
        this.arrivalPlace = arrivalPlace;
        this.departurePlace = departurePlace;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNumber='" + ticketNumber + '\'' +
                ", arrivalPlace='" + arrivalPlace + '\'' +
                ", departurePlace='" + departurePlace + '\'' +
                ", passengerName='" + passengerName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Ticket ticket) {
        return Integer.compare(this.ticketNumber, ticket.ticketNumber);
    }
}
