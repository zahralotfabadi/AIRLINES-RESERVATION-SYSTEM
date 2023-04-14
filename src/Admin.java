import java.util.Scanner;

public class Admin {
    Scanner scanner=new Scanner(System.in);
    Schedule schedule=new Schedule();
    FlightControl flightControl=new FlightControl();
    public void Add(){
        System.out.println("to add a flight,enter its information:\nflightId:");
       String flightIdNew=scanner.nextLine();
        System.out.println("origin:");
       String originNew=scanner.next();
        System.out.println("destination:");
       String destinationNew= scanner.next();
        System.out.println("data:");
       String dataNew=scanner.next();
        System.out.println("time:");
       String timeNew=scanner.next();
        System.out.println("price:");
       int priceNew=scanner.nextInt();
        System.out.println("seats:");
       int seatsNew=scanner.nextInt();
        Flight flightNew=new Flight(flightIdNew,originNew,destinationNew,dataNew,timeNew,priceNew,seatsNew);
        schedule.flightArrayList.add(flightNew);
    }
    public void Update(){

    }
    public void Remove(){

    }
    public void FlightSchedules(){

    }
}
