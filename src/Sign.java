import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Sign {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    Scanner input = new Scanner(System.in);
    Admin admin = new Admin();
    ArrayList<String> listUser = new ArrayList<>();
    ArrayList<String> listPassword = new ArrayList<>();
    public String user;
    public String password;

    public void signUp() {
        System.out.println("enter user:");
        user = input.nextLine();
        listUser.add(user);
        System.out.println("enter password:");
        password = input.nextLine();
        listPassword.add(password);
        System.out.println(listUser);
        System.out.println(listPassword);
    }


    public int signIn() {
        String AdminName = "Admin";
        String AdminPassword = "Admin";
        System.out.println("enter user:");
        user = input.nextLine();
        System.out.println("enter password:");
        password = input.next();
        if (Objects.equals(user, AdminName) && Objects.equals(password, AdminPassword)) {
//            int counter2 = 1;
            while (true){
                System.out.println(ANSI_PURPLE + "\n:::::::::::::::::::::::::::::::::::::::::::\n" +
                        "            ADMIN MENU OPTIONS             \n" +
                        ":::::::::::::::::::::::::::::::::::::::::::\n" +
                        "...........................................\n\n" +
                        "<1> Add\n<2> Update\n<3> Remove\n<4> Flight Schedules\n<0> Sign Out" + ANSI_RESET);
            int num1;
            num1 = input.nextInt();
            if (num1 == 1) {
                admin.Add();
            } else if (num1 == 2) {
                admin.Update();
            } else if (num1 == 3) {
                admin.Remove();
            } else if (num1 == 4) {
                admin.FlightSchedules();
            } else if (num1 == 0) {
                return 1;
            }
            else{
                System.out.println("enter the correct number!");
            }
        }
        }

        int index1=listUser.indexOf(user);
        int index2=listPassword.indexOf(password);
        if(index1>=0 && index2>=0) {
            int counter = 1;
            while (counter == 1) {
                System.out.println(ANSI_YELLOW + "\n:::::::::::::::::::::::::::::::::::::::::::\n" +
                        "            PASSENGER MENU OPTIONS             \n" +
                        ":::::::::::::::::::::::::::::::::::::::::::::::\n" +
                        "...............................................\n\n" +
                        "<1> Change password\n<2> Search flight tickets\n<3> Booking ticket\n<4> Ticket cancellation\n<5> Booked tickets\n<6> Add charge\n<0> Sign out" + ANSI_RESET);
                int num2;
                num2 = input.nextInt();
                Passengers passengers = new Passengers();
                if (num2 == 1) {
                    passengers.ChangePassword();
                } else if (num2 == 2) {
                    passengers.SearchFlightTickets();
                } else if (num2 == 3) {
                    boolean chargeBool = passengers.BookingTicket();
                    if (chargeBool){
                        counter=0;
                    }
                } else if (num2 == 4) {
                    passengers.TicketCancellation();
                } else if (num2 == 5) {
                    passengers.BookedTickets();
                } else if (num2 == 6) {
                    passengers.AddCharge();
                } else if (num2 == 0) {
                    return 1;
                }
                else{
                    System.out.println("enter the correct number!");
                }

            }



        }
        return 0;
    }

}
