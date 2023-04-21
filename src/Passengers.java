import java.util.Scanner;

public class Passengers {
    Scanner scanner = new Scanner(System.in);
    Sign sign = new Sign();
    Schedule schedule = new Schedule();
    Passenger passenger = new Passenger(sign.user, sign.password, sign.chargeSign);
    Ticket ticket=new Ticket();
    int counter = schedule.flightArrayList().size();

    public void ChangePassword() {
        System.out.println("enter passWordNew:");
        sign.password = scanner.nextLine();
        passenger.setPsrPassword(sign.password);
    }

    public void SearchFlightTickets() {
        System.out.println("enter a word to search for a flight ticket: ");
        String wordSearch1 = scanner.nextLine();
        String wordSearch2;


        switch (wordSearch1) {
            case "flightId":
                System.out.println("enter element of flightId:");
                wordSearch2 = scanner.nextLine();

                for (int i = 0; i < counter; i++) {
                    if (wordSearch2.equals(schedule.createFlightId()[i])) {
                        System.out.println("|\t" + schedule.createFlightId()[i] + "\t|\t" + schedule.createOrigin()[i] + "\t|\t" + schedule.createDestination()[i] + "\t|\t" + schedule.createDatas()[i] + "\t|\t" + schedule.createTimes()[i] + "\t|\t" + schedule.createPrice()[i] + "\t|\t" + schedule.createSeats()[i] + "\t|");
                    }
                }
                break;
            case "origin":
                System.out.println("enter element of origin:");
                wordSearch2 = scanner.nextLine();
                for (int i = 0; i < counter; i++) {
                    if (wordSearch2.equals(schedule.createOrigin()[i])) {
                        System.out.println("|\t" + schedule.createFlightId()[i] + "\t|\t" + schedule.createOrigin()[i] + "\t|\t" + schedule.createDestination()[i] + "\t|\t" + schedule.createDatas()[i] + "\t|\t" + schedule.createTimes()[i] + "\t|\t" + schedule.createPrice()[i] + "\t|\t" + schedule.createSeats()[i] + "\t|");
                    }
                }
                break;
            case "destination":
                System.out.println("enter element of destination:");
                wordSearch2 = scanner.nextLine();
                for (int i = 0; i < counter; i++) {
                    if (wordSearch2.equals(schedule.createDestination()[i])) {
                        System.out.println("|\t" + schedule.createFlightId()[i] + "\t|\t" + schedule.createOrigin()[i] + "\t|\t" + schedule.createDestination()[i] + "\t|\t" + schedule.createDatas()[i] + "\t|\t" + schedule.createTimes()[i] + "\t|\t" + schedule.createPrice()[i] + "\t|\t" + schedule.createSeats()[i] + "\t|");
                    }
                }
                break;
            case "data":
                System.out.println("enter element of data:");
                wordSearch2 = scanner.nextLine();
                for (int i = 0; i < counter; i++) {
                    if (wordSearch2.equals(schedule.createDatas()[i])) {
                        System.out.println("|\t" + schedule.createFlightId()[i] + "\t|\t" + schedule.createOrigin()[i] + "\t|\t" + schedule.createDestination()[i] + "\t|\t" + schedule.createDatas()[i] + "\t|\t" + schedule.createTimes()[i] + "\t|\t" + schedule.createPrice()[i] + "\t|\t" + schedule.createSeats()[i] + "\t|");
                    }
                }
                break;
            case "time":
                System.out.println("enter element of time:");
                wordSearch2 = scanner.nextLine();
                for (int i = 0; i < counter; i++) {
                    if (wordSearch2.equals(schedule.createTimes()[i])) {
                        System.out.println("|\t" + schedule.createFlightId()[i] + "\t|\t" + schedule.createOrigin()[i] + "\t|\t" + schedule.createDestination()[i] + "\t|\t" + schedule.createDatas()[i] + "\t|\t" + schedule.createTimes()[i] + "\t|\t" + schedule.createPrice()[i] + "\t|\t" + schedule.createSeats()[i] + "\t|");
                    }
                }
                break;
            case "price":
                System.out.println("enter element of price:");
                wordSearch2 = scanner.nextLine();
                for (int i = 0; i < counter; i++) {
                    if (Integer.parseInt(wordSearch2) == schedule.createPrice()[i]) {
                        System.out.println("|\t" + schedule.createFlightId()[i] + "\t|\t" + schedule.createOrigin()[i] + "\t|\t" + schedule.createDestination()[i] + "\t|\t" + schedule.createDatas()[i] + "\t|\t" + schedule.createTimes()[i] + "\t|\t" + schedule.createPrice()[i] + "\t|\t" + schedule.createSeats()[i] + "\t|");
                    }
                }
                break;
            case "seats":
                System.out.println("enter element of seats:");
                wordSearch2 = scanner.nextLine();
                for (int i = 0; i < counter; i++) {
                    if (Integer.parseInt(wordSearch2) == schedule.createSeats()[i]) {
                        System.out.println("|\t" + schedule.createFlightId()[i] + "\t|\t" + schedule.createOrigin()[i] + "\t|\t" + schedule.createDestination()[i] + "\t|\t" + schedule.createDatas()[i] + "\t|\t" + schedule.createTimes()[i] + "\t|\t" + schedule.createPrice()[i] + "\t|\t" + schedule.createSeats()[i] + "\t|");
                    }
                }
                break;

            default:
                System.out.println("invalid input");
                break;
        }


    }

    public boolean BookingTicket() {
        System.out.println("enter Flight Id to book the ticket:");
        String enterFlightId = scanner.nextLine();
        for (int i = 0; i < counter; i++) {
            if (enterFlightId.equals(schedule.createFlightId()[i])) {
                System.out.println("mew" + passenger.getCharge());
                if (passenger.getCharge() > (schedule.createPrice()[i])) {
                    System.out.println("mew");
                    schedule.createSeats()[i] = schedule.createSeats()[i] - 1;
                    System.out.println(passenger.getCharge());
                    passenger.setCharge(passenger.getCharge() - schedule.createPrice()[i]);
                    String ticketId = passenger.getPsrName() + passenger.getPsrPassword() + schedule.createFlightId()[i];
                    ticket.setTicketId(ticketId);
                    System.out.println("ticketId:" + ticketId);
                } else {
                    System.out.println("not enough charge!=>return to the previous menu.");
                    return false;
                }
            }
        }
        return true;
    }

    public void TicketCancellation() {
        System.out.println("enter ticket Id to cancel the ticket:");
        String enterFlightId = scanner.nextLine();
        for (int i = 0; i < counter; i++) {
            if (enterFlightId.equals(ticket.getTicketId())) {
                schedule.createSeats()[i] = schedule.createPrice()[i] + 1;
                passenger.setCharge(passenger.getCharge() + schedule.createPrice()[i]);
            }
        }
    }

        public void BookedTickets () {
        }

        public void AddCharge () {
            System.out.println("enter the charge increment amount:");
            int addCharge = scanner.nextInt();
            passenger.setCharge(passenger.getCharge() + addCharge);
        }

}
