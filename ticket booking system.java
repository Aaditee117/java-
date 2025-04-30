class TicketBookingSystem {
    private int totalTickets = 30;
    public synchronized void bookTicket(String user, int requestedTickets) {
        if (requestedTickets <= totalTickets) {
            System.out.println(user + " booked " + requestedTickets + " ticket(s).");
            totalTickets -= requestedTickets;
            System.out.println("Tickets left: " + totalTickets);
        } else {
            System.out.println(user + " tried to book " + requestedTickets + " ticket(s), but only " + totalTickets + " left.");
        }
    }
}
class BookingThread extends Thread {
    private TicketBookingSystem bookingSystem;
    private String user;
    private int ticketsToBook;

    public BookingThread(TicketBookingSystem bookingSystem, String user, int ticketsToBook) {
        this.bookingSystem = bookingSystem;
        this.user = user;
        this.ticketsToBook = ticketsToBook;
    }

    public void run() {
        bookingSystem.bookTicket(user, ticketsToBook);
    }
}
public class Main {
    public static void main(String[] args) {
        TicketBookingSystem system = new TicketBookingSystem();
        BookingThread user1 = new BookingThread(system, "Aditee", 4);
        BookingThread user2 = new BookingThread(system, "shantanu", 3);
        BookingThread user3 = new BookingThread(system, "Anubhav",15);
        BookingThread user4 = new BookingThread(system, "isha",5);
        user1.start();
        user2.start();
        user3.start();
        user4.start();
}
}