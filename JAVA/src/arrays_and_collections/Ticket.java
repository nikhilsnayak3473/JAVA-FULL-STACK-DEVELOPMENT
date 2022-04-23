package arrays_and_collections;

public class Ticket {
    private final String ticketNumber;
    String passengerName;
    String arrivalPlace;
    String departurePlace;

    public Ticket(String ticketNumber, String passengerName, String arrivalPlace, String departurePlace) {
        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
        this.arrivalPlace = arrivalPlace;
        this.departurePlace = departurePlace;
    }

    public String getTicketNumber() {
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
}
