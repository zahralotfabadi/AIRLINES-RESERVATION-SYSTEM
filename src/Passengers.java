import java.util.Scanner;

public class Passengers {
    Scanner scanner = new Scanner(System.in);
    Sign sign = new Sign();
    Schedule schedule = new Schedule();
    Passenger passenger = new Passenger(sign.user, sign.password);

    public void ChangePassword() {
        System.out.println("enter passWordNew:");
        sign.password = scanner.nextLine();
    }

    public void SearchFlightTickets() {

    }

    public boolean BookingTicket() {
        System.out.println("enter Flight Id to book the ticket:");
        String enterFlightId = scanner.nextLine();
        if (enterFlightId.equals(schedule.flightId1)) {
            if (passenger.charge >= schedule.price1) {
                schedule.seats1 = schedule.seats1 - 1;
                passenger.charge= passenger.charge - schedule.price1;
            }
            else {
                System.out.println("not enough charge!");
                return false;
            }
        } else if (enterFlightId.equals(schedule.flightId2)) {
            if (passenger.charge >= schedule.price2) {
                schedule.seats2 = schedule.seats2 - 1;
                passenger.charge = passenger.charge - schedule.price2;
            }
            else {
                System.out.println("not enough charge!=>return to the previous menu.");
                return false;
            }
        } else if (enterFlightId.equals(schedule.flightId3)) {
            if(passenger.charge>= schedule.price3) {
                schedule.seats3 = schedule.seats3 - 1;
                passenger.charge = passenger.charge - schedule.price3;
            }
            else {
                System.out.println("not enough charge!");
                return false;
            }
        }
//       else if(enterFlightId.equals(seats)){
//       }
        return true;
    }

    public void TicketCancellation() {
        System.out.println("enter Flight Id to cancel the ticket:");
        String enterFlightId = scanner.nextLine();
        if (enterFlightId.equals(schedule.flightId1)) {
            schedule.seats1 = schedule.seats1 + 1;
            passenger.charge= passenger.charge+schedule.price1;
        } else if (enterFlightId.equals(schedule.flightId2)) {
            schedule.seats2 = schedule.seats2 + 1;
            passenger.charge= passenger.charge+schedule.price2;
        } else if (enterFlightId.equals(schedule.flightId3)) {
            schedule.seats3 = schedule.seats3 + 1;
            passenger.charge= passenger.charge+ schedule.price3;
        }

    }

    public void BookedTickets() {

    }

    public int AddCharge() {
        System.out.println("enter the charge increment amount:");
        int addCharge=scanner.nextInt();
        passenger.charge=passenger.charge+addCharge;
        return passenger.charge;
    }
}
