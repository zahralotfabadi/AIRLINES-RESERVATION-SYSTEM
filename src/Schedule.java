import java.util.ArrayList;

public class Schedule {
   public ArrayList<Flight> flightArrayList=new ArrayList<>();


    public String flightId1 = "WX-12", origin1 = "Yazd", destination1 = "Tehran", data1 = "1401-12-10", time1 = "12:30",
            flightId2 = "WZ-15", origin2 = "Mashhad", destination2 = "Ahvaz", data2 = "1401-12-11", time2 = "08:00",
            flightId3 = "BG-22", origin3 = "Shiraz", destination3 = "Tabriz", data3 = "1401-12-12", time3 = "22:30";
    public int price1 = 700000, seats1 = 51, price2 = 900000, seats2 = 245, price3 = 1100000, seats3 = 12;


    Flight flight1 = new Flight(flightId1, origin1, destination1, data1, time1, price1, seats1);
    Flight flight2 = new Flight(flightId2, origin2, destination2, data2, time2, price2, seats2);
    Flight flight3 = new Flight(flightId3, origin3, destination3, data3, time3, price3, seats3);

    public ArrayList<Flight> flightArrayList() {
    flightArrayList.add(flight1);
    flightArrayList.add(flight2);
    flightArrayList.add(flight3);
        return flightArrayList;
    }

}
