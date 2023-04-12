import java.util.Scanner;

public class Menu {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    int count=1,counter=-1;
    public void menuFunc(){
        while (count == 1) {
            System.out.println(ANSI_CYAN+"::::::::::::::::::::::::::::::::::::::::::::::::::::::::::" +
                    "\n          WELCOME TO AIRLINE RESERVATION SYSTEM\n" +
                    "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                    "......................MENU OPTIONS........................\n\n" +
                    "< 1 > Sign in \n< 2 > Sign up"+ANSI_RESET);
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            Sign sign = new Sign();
            if (number == 2) {
                counter++;
                sign.signUp(counter);
            }
            if(number==1) {
                int out = sign.signIn(counter);
                if (out == 0) {
                    count = 0;
                }
            }
        }
    }
    }
