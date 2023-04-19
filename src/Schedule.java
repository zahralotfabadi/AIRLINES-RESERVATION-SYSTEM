import java.util.ArrayList;

public class Schedule {
    public ArrayList<Flight> flightArray = new ArrayList<>();
//    public static Admin admin = new Admin();

    public String flightId1 = "WX-12", origin1 = "Yazd", destination1 = "Tehran", data1 = "1401-12-10", time1 = "12:30",
            flightId2 = "WZ-15", origin2 = "Mashhad", destination2 = "Ahvaz", data2 = "1401-12-11", time2 = "08:00",
            flightId3 = "BG-22", origin3 = "Shiraz", destination3 = "Tabriz", data3 = "1401-12-12", time3 = "22:30",
            flightId4 = "AW-30", origin4 = "Qom", destination4 = "Mashhad", data4 = "1402-01-05", time4 = "15:15",
            flightId5 = "ZL-31", origin5 = "Sanandaj", destination5 = "Isfahan", data5 = "1402-01-31", time5 = "18:00",
            flightId6 = "SY-20", origin6 = "Yasuj", destination6 = "Birjand", data6 = "1402-01-06", time6 = "16:45",
            flightId7 = "EP-19", origin7 = "Bushehr", destination7 = "Sari", data7 = "1402-01-07", time7 = "10:50",
            flightId8 = "QU-99", origin8 = "Arak", destination8 = "Orumiyeh", data8 = "1402-01-08", time8 = "14:10",
            flightId9 = "IO-77", origin9 = "Rasht", destination9 = "Gorgan", data9 = "1402-01-09", time9 = "7:45",
            flightId10 = "CK-88", origin10 = "Abadan", destination10 = "Ardabil", data10 = "1402-01-10", time10 = "08:25";

    public int price1 = 700000, seats1 = 51,
            price2 = 900000, seats2 = 245,
            price3 = 1100000, seats3 = 12,
            price4 = 500000, seats4 = 38,
            price5 = 550000, seats5 = 30,
            price6 = 600000, seats6 = 26,
            price7 = 950000, seats7 = 23,
            price8 = 450000, seats8 = 19,
            price9 = 300000, seats9 = 24,
            price10 = 750000, seats10 = 37;

    @Override
    public String toString() {
        return "Schedule{" +
                "price1=" + price1 +
                ", seats1=" + seats1 +
                ", price2=" + price2 +
                ", seats2=" + seats2 +
                ", price3=" + price3 +
                ", seats3=" + seats3 +
                ", price4=" + price4 +
                ", seats4=" + seats4 +
                ", price5=" + price5 +
                ", seats5=" + seats5 +
                ", price6=" + price6 +
                ", seats6=" + seats6 +
                ", price7=" + price7 +
                ", seats7=" + seats7 +
                ", price8=" + price8 +
                ", seats8=" + seats8 +
                ", price9=" + price9 +
                ", seats9=" + seats9 +
                ", price10=" + price10 +
                ", seats10=" + seats10 +
                '}';
    }

    Flight flight1 = new Flight(flightId1, origin1, destination1, data1, time1, price1, seats1);
    Flight flight2 = new Flight(flightId2, origin2, destination2, data2, time2, price2, seats2);
    Flight flight3 = new Flight(flightId3, origin3, destination3, data3, time3, price3, seats3);
    Flight flight4 = new Flight(flightId4, origin4, destination4, data4, time4, price4, seats4);
    Flight flight5 = new Flight(flightId5, origin5, destination5, data5, time5, price5, seats5);
    Flight flight6 = new Flight(flightId6, origin6, destination6, data6, time6, price6, seats6);
    Flight flight7 = new Flight(flightId7, origin7, destination7, data7, time7, price7, seats7);
    Flight flight8 = new Flight(flightId8, origin8, destination8, data8, time8, price8, seats8);
    Flight flight9 = new Flight(flightId9, origin9, destination9, data9, time9, price9, seats9);
    Flight flight10 = new Flight(flightId10, origin10, destination10, data10, time10, price10, seats10);
     Flight[] arrayFlights;



    public ArrayList<Flight> flightArrayList() {
        arrayFlights[0]=flight1;
        arrayFlights[1]=flight2;
        arrayFlights[2]=flight3;
        arrayFlights[3]=flight4;
        arrayFlights[4]=flight5;
        arrayFlights[5]=flight6;
        arrayFlights[6]=flight7;
        arrayFlights[7]=flight8;
        arrayFlights[8]=flight9;
        arrayFlights[9]=flight10;
        flightArray.add(0, flight1);
        flightArray.add(1, flight2);
        flightArray.add(2, flight3);
        flightArray.add(3, flight4);
        flightArray.add(4, flight5);
        flightArray.add(5, flight6);
        flightArray.add(6, flight7);
        flightArray.add(7, flight8);
        flightArray.add(8, flight9);
        flightArray.add(9, flight10);

        return flightArray;
    }

    public void printSchedule() {
        System.out.println("|\tFlight Id\t|\tOrigin\t|\tDestination\t|\t  Data  \t|\tTime\t|\tPrice\t| Seats |\n"
                + "---------------------------------------------------------------------------------------------\n" +
                "|\t  " + flightId1 + " \t|\t" + origin1 + "\t|\t  " + destination1 + " \t|\t" + data1 + "\t|\t" + time1 + "\t|\t" + price1 + "\t|\t" + seats1 + "\t|\n"
                + "---------------------------------------------------------------------------------------------\n" +
                "|\t  " + flightId2 + " \t|\t" + origin2 + "\t|\t  " + destination2 + " \t|\t" + data2 + "\t|\t" + time2 + "\t|\t" + price2 + "\t|\t" + seats2 + "\t|\n"
                + "---------------------------------------------------------------------------------------------\n" +
                "|\t  " + flightId3 + " \t|\t" + origin3 + "\t|\t  " + destination3 + " \t|\t" + data3 + "\t|\t" + time3 + "\t|\t" + price3 + "\t|\t" + seats3 + "\t|\n"
                + "---------------------------------------------------------------------------------------------\n" +
                "|\t  " + flightId4 + " \t|\t " + origin4 + " \t|\t  " + destination4 + " \t|\t" + data4 + "\t|\t" + time4 + "\t|\t" + price4 + "\t|\t" + seats4 + "\t|\n"
                + "---------------------------------------------------------------------------------------------\n" +
                "|\t  " + flightId5 + " \t|\t" + origin5 + "|\t  " + destination5 + " \t|\t" + data5 + "\t|\t" + time5 + "\t|\t" + price5 + "\t|\t" + seats5 + "\t|\n"
                + "---------------------------------------------------------------------------------------------\n" +
                "|\t  " + flightId6 + " \t|\t" + origin6 + "\t|\t  " + destination6 + " \t|\t" + data6 + "\t|\t" + time6 + "\t|\t" + price6 + "\t|\t" + seats6 + "\t|\n"
                + "---------------------------------------------------------------------------------------------\n" +
                "|\t  " + flightId7 + " \t|\t" + origin7 + "\t|\t  " + destination7 + "  \t|\t" + data7 + "\t|\t" + time7 + "\t|\t" + price7 + "\t|\t" + seats7 + "\t|\n"
                + "---------------------------------------------------------------------------------------------\n" +
                "|\t  " + flightId8 + " \t|\t" + origin8 + "\t|\t  " + destination8 + " \t|\t" + data8 + "\t|\t" + time8 + "\t|\t" + price8 + "\t|\t" + seats8 + "\t|\n"
                + "---------------------------------------------------------------------------------------------\n" +
                "|\t  " + flightId9 + " \t|\t" + origin9 + "\t|\t  " + destination9 + " \t|\t" + data9 + "\t|\t" + time9 + "\t|\t" + price9 + "\t|\t" + seats9 + "\t|\n"
                + "---------------------------------------------------------------------------------------------\n" +
                "|\t  " + flightId10 + " \t|\t" + origin10 + "\t|\t  " + destination10 + " \t|\t" + data10 + "\t|\t" + time10 + "\t|\t" + price10 + "\t|\t" + seats10 + "\t|\n"
                + "---------------------------------------------------------------------------------------------\n");
    }
}

