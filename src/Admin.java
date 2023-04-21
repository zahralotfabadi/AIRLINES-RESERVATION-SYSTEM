import java.util.Scanner;

public class Admin {
    Scanner scanner = new Scanner(System.in);
    Schedule schedule = new Schedule();
    String flightIdNew, originNew, destinationNew, dataNew, timeNew;
    int priceNew, seatsNew;

    @Override
    public String toString() {
        return "Admin{" +
                "priceNew=" + priceNew +
                ", seatsNew=" + seatsNew +
                '}';
    }

    public void Add() {
        System.out.println("to add a flight,enter its information:\nflightId:");
        flightIdNew = scanner.nextLine();
        System.out.println("origin:");
        originNew = scanner.next();
        System.out.println("destination:");
        destinationNew = scanner.next();
        System.out.println("data:");
        dataNew = scanner.next();
        System.out.println("time:");
        timeNew = scanner.next();
        System.out.println("price:");
        priceNew = scanner.nextInt();
        System.out.println("seats:");
        seatsNew = scanner.nextInt();
        schedule.flightArrayList().add(new Flight(flightIdNew, originNew, destinationNew, dataNew, timeNew, priceNew, seatsNew));
        FlightSchedules();
    }

    public void Update() {
        FlightSchedules();
        System.out.println("enter name of flight  want to update:");
        String numUpdate1 = scanner.next();
        String numUpdate2;
        int counter = schedule.flightArrayList().size();

        switch (numUpdate1) {
            case "flightId":
                System.out.println("enter element of flightId:");
                numUpdate2 = scanner.nextLine();

                for (int i = 0; i < counter; i++) {
                    if (numUpdate2.equals(schedule.createFlightId()[i])) {
                        System.out.println("|\t" + schedule.createFlightId()[i] + "\t|\t" + schedule.createOrigin()[i] + "\t|\t" + schedule.createDestination()[i] + "\t|\t" + schedule.createDatas()[i] + "\t|\t" + schedule.createTimes()[i] + "\t|\t" + schedule.createPrice()[i] + "\t|\t" + schedule.createSeats()[i] + "\t|");
                        System.out.println("enter element_new");
                        schedule.createFlightId()[i] = scanner.nextLine();
                    }
                }
                break;
            case "origin":
                System.out.println("enter element of origin:");
                numUpdate2 = scanner.nextLine();
                for (int i = 0; i < counter; i++) {
                    if (numUpdate2.equals(schedule.createOrigin()[i])) {
                        System.out.println("|\t" + schedule.createFlightId()[i] + "\t|\t" + schedule.createOrigin()[i] + "\t|\t" + schedule.createDestination()[i] + "\t|\t" + schedule.createDatas()[i] + "\t|\t" + schedule.createTimes()[i] + "\t|\t" + schedule.createPrice()[i] + "\t|\t" + schedule.createSeats()[i] + "\t|");
                        System.out.println("enter element_new");
                        schedule.createOrigin()[i] = scanner.nextLine();
                    }
                }
                break;
            case "destination":
                System.out.println("enter element of destination:");
                numUpdate2 = scanner.nextLine();
                for (int i = 0; i < counter; i++) {
                    if (numUpdate2.equals(schedule.createDestination()[i])) {
                        System.out.println("|\t" + schedule.createFlightId()[i] + "\t|\t" + schedule.createOrigin()[i] + "\t|\t" + schedule.createDestination()[i] + "\t|\t" + schedule.createDatas()[i] + "\t|\t" + schedule.createTimes()[i] + "\t|\t" + schedule.createPrice()[i] + "\t|\t" + schedule.createSeats()[i] + "\t|");
                        System.out.println("enter element_new");
                    schedule.createDestination()[i] = scanner.nextLine();
                    }
                }
                break;
            case "data":
                System.out.println("enter element of data:");
                numUpdate2 = scanner.nextLine();
                for (int i = 0; i < counter; i++) {
                    if (numUpdate2.equals(schedule.createDatas()[i])) {
                        System.out.println("|\t" + schedule.createFlightId()[i] + "\t|\t" + schedule.createOrigin()[i] + "\t|\t" + schedule.createDestination()[i] + "\t|\t" + schedule.createDatas()[i] + "\t|\t" + schedule.createTimes()[i] + "\t|\t" + schedule.createPrice()[i] + "\t|\t" + schedule.createSeats()[i] + "\t|");
                        System.out.println("enter element_new");
                    schedule.createDatas()[i] = scanner.next();
                    }
                }
                break;
            case "time":
                System.out.println("enter element of time:");
                numUpdate2 = scanner.nextLine();
                for (int i = 0; i < counter; i++) {
                    if (numUpdate2.equals(schedule.createTimes()[i])) {
                        System.out.println("|\t" + schedule.createFlightId()[i] + "\t|\t" + schedule.createOrigin()[i] + "\t|\t" + schedule.createDestination()[i] + "\t|\t" + schedule.createDatas()[i] + "\t|\t" + schedule.createTimes()[i] + "\t|\t" + schedule.createPrice()[i] + "\t|\t" + schedule.createSeats()[i] + "\t|");
                        System.out.println("enter element_new");
                    schedule.createTimes()[i] = scanner.next();
                    }
                }
                break;
            case "price":
                System.out.println("enter element of price:");
                numUpdate2 = scanner.nextLine();
                for (int i = 0; i < counter; i++) {
                    if (Integer.parseInt(numUpdate2)== schedule.createPrice()[i]) {
                        System.out.println("|\t" + schedule.createFlightId()[i] + "\t|\t" + schedule.createOrigin()[i] + "\t|\t" + schedule.createDestination()[i] + "\t|\t" + schedule.createDatas()[i] + "\t|\t" + schedule.createTimes()[i] + "\t|\t" + schedule.createPrice()[i] + "\t|\t" + schedule.createSeats()[i] + "\t|");
                        System.out.println("enter element_new");
                        schedule.createPrice()[i] = scanner.nextInt();
                    }
                }
                break;
            case "seats":
                System.out.println("enter element of seats:");
                numUpdate2 = scanner.nextLine();
                for (int i = 0; i < counter; i++) {
                    if (Integer.parseInt(numUpdate2)==schedule.createSeats()[i]) {
                        System.out.println("|\t" + schedule.createFlightId()[i] + "\t|\t" + schedule.createOrigin()[i] + "\t|\t" + schedule.createDestination()[i] + "\t|\t" + schedule.createDatas()[i] + "\t|\t" + schedule.createTimes()[i] + "\t|\t" + schedule.createPrice()[i] + "\t|\t" + schedule.createSeats()[i] + "\t|");
                        System.out.println("enter element_new");
                        schedule.createSeats()[i] = scanner.nextInt();
                    }
                }
                break;

            default:
                System.out.println("invalid input");
                break;
        }
        FlightSchedules();

    }

    public void Remove() {
        FlightSchedules();
        int count = schedule.flightArrayList().size();
        System.out.println("to remove a flight,enter its index:");
        int flightIdRmv = scanner.nextInt();
        schedule.flightArrayList().remove(flightIdRmv - 1);
        for (int i = 0; i < count; i++) {
            System.out.println("|\t" + schedule.flightArrayList().get(i).getFlightId() + "\t|\t" + schedule.flightArrayList().get(i).getOrigin() + "\t|\t" + schedule.flightArrayList().get(i).getDestination() + "\t|\t" + schedule.flightArrayList().get(i).getData() + "\t|\t" + schedule.flightArrayList().get(i).getTime() + "\t|\t" + schedule.flightArrayList().get(i).getPrice() + "\t|\t" + schedule.flightArrayList().get(i).getSeats() + "\t|");
        }
        FlightSchedules();
    }

    public void FlightSchedules() {
        schedule.printSchedule();
    }
}
