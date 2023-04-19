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
        schedule.flightArrayList().add(10, new Flight(flightIdNew, originNew, destinationNew, dataNew, timeNew, priceNew, seatsNew));
    }

    public void Update() {
        schedule.printSchedule();
        System.out.println("enter number of flight  want to update:");
        int numUpdate1 = scanner.nextInt();
        String numUpdate2;
         if(numUpdate1==1){
                System.out.println("enter name of element_flight ");
                numUpdate2 = scanner.next();
                if (numUpdate2.equals("flightId1")) {
                    System.out.println("enter element_new");
                    schedule.flightId1 = scanner.next();
                }
                if (numUpdate2.equals("origin1")) {
                    System.out.println("enter element_new");
                    schedule.origin1 = scanner.next();
                }
                if (numUpdate2.equals("destination1")) {
                    System.out.println("enter element_new");
                    schedule.destination1 = scanner.next();
                }
                if (numUpdate2.equals("data1")) {
                    System.out.println("enter element_new");
                    schedule.data1 = scanner.next();
                }
                if (numUpdate2.equals("time1")) {
                    System.out.println("enter element_new");
                    schedule.time1 = scanner.next();
                }
                if (numUpdate2.equals("price1")) {
                    System.out.println("enter element_new");
                    schedule.price1 = scanner.nextInt();
                }
                if (numUpdate2.equals("seats1")) {
                    System.out.println("enter element_new");
                    schedule.seats1 = scanner.nextInt();
                }
            }
            else if(numUpdate1==2){
                System.out.println("enter name of element_flight ");
                numUpdate2 = scanner.next();
                if (numUpdate2.equals("flightId2")) {
                    System.out.println("enter element_new");
                    schedule.flightId2 = scanner.next();
                }
                if (numUpdate2.equals("origin2")) {
                    System.out.println("enter element_new");
                    schedule.origin2 = scanner.next();
                }
                if (numUpdate2.equals("destination2")) {
                    System.out.println("enter element_new");
                    schedule.destination2 = scanner.next();
                }
                if (numUpdate2.equals("data2")) {
                    System.out.println("enter element_new");
                    schedule.data2 = scanner.next();
                }
                if (numUpdate2.equals("time2")) {
                    System.out.println("enter element_new");
                    schedule.time2 = scanner.next();
                }
                if (numUpdate2.equals("price2")) {
                    System.out.println("enter element_new");
                    schedule.price2 = scanner.nextInt();
                }
                if (numUpdate2.equals("seats2")) {
                    System.out.println("enter element_new");
                    schedule.seats2 = scanner.nextInt();
                }
            } else if (numUpdate1==3) {
                System.out.println("enter name of element_flight ");
                numUpdate2 = scanner.next();
                if (numUpdate2.equals("flightId3")) {
                    System.out.println("enter element_new");
                    schedule.flightId3 = scanner.next();
                }
                if (numUpdate2.equals("origin3")) {
                    System.out.println("enter element_new");
                    schedule.origin3 = scanner.next();
                }
                if (numUpdate2.equals("destination3")) {
                    System.out.println("enter element_new");
                    schedule.destination3 = scanner.next();
                }
                if (numUpdate2.equals("data3")) {
                    System.out.println("enter element_new");
                    schedule.data3 = scanner.next();
                }
                if (numUpdate2.equals("time3")) {
                    System.out.println("enter element_new");
                    schedule.time3 = scanner.next();
                }
                if (numUpdate2.equals("price3")) {
                    System.out.println("enter element_new");
                    schedule.price3 = scanner.nextInt();
                }
                if (numUpdate2.equals("seats3")) {
                    System.out.println("enter element_new");
                    schedule.seats3 = scanner.nextInt();
                }
            } else if (numUpdate1==4) {
                System.out.println("enter name of element_flight ");
                numUpdate2 = scanner.next();
                if (numUpdate2.equals("flightId4")) {
                    System.out.println("enter element_new");
                    schedule.flightId4 = scanner.next();
                }
                if (numUpdate2.equals("origin4")) {
                    System.out.println("enter element_new");
                    schedule.origin4 = scanner.next();
                }
                if (numUpdate2.equals("destination4")) {
                    System.out.println("enter element_new");
                    schedule.destination4 = scanner.next();
                }
                if (numUpdate2.equals("data4")) {
                    System.out.println("enter element_new");
                    schedule.data4 = scanner.next();
                }
                if (numUpdate2.equals("time4")) {
                    System.out.println("enter element_new");
                    schedule.time4 = scanner.next();
                }
                if (numUpdate2.equals("price4")) {
                    System.out.println("enter element_new");
                    schedule.price4 = scanner.nextInt();
                }
                if (numUpdate2.equals("seats4")) {
                    System.out.println("enter element_new");
                    schedule.seats4 = scanner.nextInt();
                }
                } else if (numUpdate1==5) {
                System.out.println("enter name of element_flight ");
                numUpdate2 = scanner.next();
                if (numUpdate2.equals("flightId5")) {
                    System.out.println("enter element_new");
                    schedule.flightId5 = scanner.next();
                }
                if (numUpdate2.equals("origin5")) {
                    System.out.println("enter element_new");
                    schedule.origin5 = scanner.next();
                }
                if (numUpdate2.equals("destination5")) {
                    System.out.println("enter element_new");
                    schedule.destination5 = scanner.next();
                }
                if (numUpdate2.equals("data5")) {
                    System.out.println("enter element_new");
                    schedule.data5 = scanner.next();
                }
                if (numUpdate2.equals("time5")) {
                    System.out.println("enter element_new");
                    schedule.time5 = scanner.next();
                }
                if (numUpdate2.equals("price5")) {
                    System.out.println("enter element_new");
                    schedule.price5 = scanner.nextInt();
                }
                if (numUpdate2.equals("seats5")) {
                    System.out.println("enter element_new");
                    schedule.seats5 = scanner.nextInt();
                }
            }
            else if(numUpdate1==6) {
                System.out.println("enter name of element_flight ");
                numUpdate2 = scanner.next();
                if (numUpdate2.equals("flightId6")) {
                    System.out.println("enter element_new");
                    schedule.flightId6 = scanner.next();
                }
                if (numUpdate2.equals("origin6")) {
                    System.out.println("enter element_new");
                    schedule.origin6 = scanner.next();
                }
                if (numUpdate2.equals("destination6")) {
                    System.out.println("enter element_new");
                    schedule.destination6 = scanner.next();
                }
                if (numUpdate2.equals("data6")) {
                    System.out.println("enter element_new");
                    schedule.data6 = scanner.next();
                }
                if (numUpdate2.equals("time6")) {
                    System.out.println("enter element_new");
                    schedule.time6 = scanner.next();
                }
                if (numUpdate2.equals("price6")) {
                    System.out.println("enter element_new");
                    schedule.price6 = scanner.nextInt();
                }
                if (numUpdate2.equals("seats6")) {
                    System.out.println("enter element_new");
                    schedule.seats6 = scanner.nextInt();
                }
            }
            else if(numUpdate1==7) {
                System.out.println("enter name of element_flight ");
                numUpdate2 = scanner.next();
                if (numUpdate2.equals("flightId7")) {
                    System.out.println("enter element_new");
                    schedule.flightId7 = scanner.next();
                }
                if (numUpdate2.equals("origin7")) {
                    System.out.println("enter element_new");
                    schedule.origin7 = scanner.next();
                }
                if (numUpdate2.equals("destination7")) {
                    System.out.println("enter element_new");
                    schedule.destination7 = scanner.next();
                }
                if (numUpdate2.equals("data7")) {
                    System.out.println("enter element_new");
                    schedule.data7 = scanner.next();
                }
                if (numUpdate2.equals("time7")) {
                    System.out.println("enter element_new");
                    schedule.time7 = scanner.next();
                }
                if (numUpdate2.equals("price7")) {
                    System.out.println("enter element_new");
                    schedule.price7 = scanner.nextInt();
                }
                if (numUpdate2.equals("seats7")) {
                    System.out.println("enter element_new");
                    schedule.seats7 = scanner.nextInt();
                }
            }
            else if(numUpdate1==8) {
                System.out.println("enter name of element_flight ");
                numUpdate2 = scanner.next();
                if (numUpdate2.equals("flightId8")) {
                    System.out.println("enter element_new");
                    schedule.flightId8 = scanner.next();
                }
                if (numUpdate2.equals("origin8")) {
                    System.out.println("enter element_new");
                    schedule.origin8 = scanner.next();
                }
                if (numUpdate2.equals("destination8")) {
                    System.out.println("enter element_new");
                    schedule.destination8 = scanner.next();
                }
                if (numUpdate2.equals("data8")) {
                    System.out.println("enter element_new");
                    schedule.data8 = scanner.next();
                }
                if (numUpdate2.equals("time8")) {
                    System.out.println("enter element_new");
                    schedule.time8 = scanner.next();
                }
                if (numUpdate2.equals("price8")) {
                    System.out.println("enter element_new");
                    schedule.price8 = scanner.nextInt();
                }
                if (numUpdate2.equals("seats8")) {
                    System.out.println("enter element_new");
                    schedule.seats8 = scanner.nextInt();
                }
            }
            else if(numUpdate1==9) {
                System.out.println("enter name of element_flight ");
                numUpdate2 = scanner.next();
                if (numUpdate2.equals("flightId9")) {
                    System.out.println("enter element_new");
                    schedule.flightId9 = scanner.next();
                }
                if (numUpdate2.equals("origin9")) {
                    System.out.println("enter element_new");
                    schedule.origin9 = scanner.next();
                }
                if (numUpdate2.equals("destination9")) {
                    System.out.println("enter element_new");
                    schedule.destination9 = scanner.next();
                }
                if (numUpdate2.equals("data9")) {
                    System.out.println("enter element_new");
                    schedule.data9 = scanner.next();
                }
                if (numUpdate2.equals("time9")) {
                    System.out.println("enter element_new");
                    schedule.time9 = scanner.next();
                }
                if (numUpdate2.equals("price9")) {
                    System.out.println("enter element_new");
                    schedule.price9 = scanner.nextInt();
                }
                if (numUpdate2.equals("seats9")) {
                    System.out.println("enter element_new");
                    schedule.seats9 = scanner.nextInt();
                }
            }
            else if(numUpdate1==10) {
                System.out.println("enter name of element_flight ");
                numUpdate2 = scanner.next();
                if (numUpdate2.equals("flightId10")) {
                    System.out.println("enter element_new");
                    schedule.flightId10 = scanner.next();
                }
                if (numUpdate2.equals("origin10")) {
                    System.out.println("enter element_new");
                    schedule.origin10 = scanner.next();
                }
                if (numUpdate2.equals("destination10")) {
                    System.out.println("enter element_new");
                    schedule.destination10 = scanner.next();
                }
                if (numUpdate2.equals("data10")) {
                    System.out.println("enter element_new");
                    schedule.data10 = scanner.next();
                }
                if (numUpdate2.equals("time10")) {
                    System.out.println("enter element_new");
                    schedule.time10 = scanner.next();
                }
                if (numUpdate2.equals("price10")) {
                    System.out.println("enter element_new");
                    schedule.price10 = scanner.nextInt();
                }
                if (numUpdate2.equals("seats10")) {
                    System.out.println("enter element_new");
                    schedule.seats10 = scanner.nextInt();
                }
            }
        schedule.printSchedule();

    }

    public void Remove() {
        schedule.printSchedule();
        System.out.println("to remove a flight,enter its index:");
        int flightIdRmv = scanner.nextInt();
        System.out.println(schedule.flightArrayList().remove(flightIdRmv));


    }

    public void FlightSchedules() {
        schedule.printSchedule();
    }
}
