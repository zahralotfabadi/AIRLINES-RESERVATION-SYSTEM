public class Ticket {
    Sign sign2 = new Sign();
    Passenger passenger = new Passenger(sign2.user, sign2.password, sign2.chargeSign);

    public String ticketId;

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
}
