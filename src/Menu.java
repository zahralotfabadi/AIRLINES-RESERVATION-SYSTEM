import java.util.Scanner;

public class Menu {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    Scanner input = new Scanner(System.in);
    Sign sign = new Sign();


    int count=1;
    public void menuFunc(){
        while (count == 1) {
            System.out.println(ANSI_CYAN+"\n::::::::::::::::::::::::::::::::::::::::::::::::::::::::::" +
                    "\n          WELCOME TO AIRLINE RESERVATION SYSTEM\n" +
                    "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                    "......................MENU OPTIONS........................\n\n" +
                    "< 1 > Sign in \n< 2 > Sign up"+ANSI_RESET);

            int number = input.nextInt();
            if (number == 2) {
                sign.signUp();
            }
            if(number==1) {
                int out = sign.signIn();
                if (out == 0) {
                    count = 0;
                }
            }
//            else {
//                System.out.println("enter the correct number!");
//            }
        }
    }
    }
