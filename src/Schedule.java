import java.util.ArrayList;

public class Schedule {
    public ArrayList<Flight> flightArray = new ArrayList<>();
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

    public ArrayList<Flight> flightArrayList() {
        flightArray.add( flight1);
        flightArray.add( flight2);
        flightArray.add( flight3);
        flightArray.add( flight4);
        flightArray.add( flight5);
        flightArray.add( flight6);
        flightArray.add( flight7);
        flightArray.add( flight8);
        flightArray.add( flight9);
        flightArray.add( flight10);

        return flightArray;
    }

    public String[] createFlightId() {
        String[] flightIds = new String[10];
        flightIds[0] = flightId1;
        flightIds[1] = flightId2;
        flightIds[2] = flightId3;
        flightIds[3] = flightId4;
        flightIds[4] = flightId5;
        flightIds[5] = flightId6;
        flightIds[6] = flightId7;
        flightIds[7] = flightId8;
        flightIds[8] = flightId9;
        flightIds[9] = flightId10;
        return flightIds;
    }

    public String[] createOrigin() {
        String[] origins = new String[11];
        origins[0] = origin1;
        origins[1] = origin2;
        origins[2] = origin3;
        origins[3] = origin4;
        origins[4] = origin5;
        origins[5] = origin6;
        origins[6] = origin7;
        origins[7] = origin8;
        origins[8] = origin9;
        origins[9] = origin10;

        return origins;
    }

    public String[] createDestination() {
        String[] destinations = new String[10];
        destinations[0] = destination1;
        destinations[1] = destination2;
        destinations[2] = destination3;
        destinations[3] = destination4;
        destinations[4] = destination5;
        destinations[5] = destination6;
        destinations[6] = destination7;
        destinations[7] = destination8;
        destinations[8] = destination9;
        destinations[9] = destination10;
        return destinations;
    }
    public String []createDatas(){
        String[] datas = new String[10];
        datas[0]=data1;
        datas[1]=data2;
        datas[2]=data3;
        datas[3]=data4;
        datas[4]=data5;
        datas[5]=data6;
        datas[6]=data7;
        datas[7]=data8;
        datas[8]=data9;
        datas[9]=data10;
return datas;
    }
    public String[]createTimes(){
        String[] times = new String[10];
        times[0]=time1;
        times[1]=time2;
        times[2]=time3;
        times[3]=time4;
        times[4]=time5;
        times[5]=time6;
        times[6]=time7;
        times[7]=time8;
        times[8]=time9;
        times[9]=time10;
        return times;
    }
    public int[] createPrice(){
        int[]prices = new int[10];
        prices[0]=price1;
        prices[1]=price2;
        prices[2]=price3;
        prices[3]=price4;
        prices[4]=price5;
        prices[5]=price6;
        prices[6]=price7;
        prices[7]=price8;
        prices[8]=price9;
        prices[9]=price10;
return prices;
    }
    public int[] createSeats(){
        int[]seats=new int[10];
        seats[0]=seats1;
        seats[1]=seats2;
        seats[2]=seats3;
        seats[3]=seats4;
        seats[4]=seats5;
        seats[5]=seats6;
        seats[6]=seats7;
        seats[7]=seats8;
        seats[8]=seats9;
        seats[9]=seats10;
return seats;
    }

    public void printSchedule() {
        int count = flightArrayList().size();

        System.out.println("| Flight Id |\tOrigin\t|Destination|\t\tData\t|\tTime\t|\tPrice\t| Seats |\n" +
                "--------------------------------------------------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.println("|\t" + flightArrayList().get(i).getFlightId() + "\t|\t" + flightArrayList().get(i).getOrigin() + "\t|\t" + flightArrayList().get(i).getDestination() + "\t|\t" + flightArrayList().get(i).getData() + "\t|\t" + flightArrayList().get(i).getTime() + "\t|\t" + flightArrayList().get(i).getPrice() + "\t|\t" + flightArrayList().get(i).getSeats() + "\t|");
        }

    }
}

