import java.util.Scanner;

public class Weekday {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the weekday number: ");
        int number = keyboard.nextInt();
        String day;
        if (number == 1){ //if it is 1, print day
            day = "Sunday";
            System.out.println("it is " + day);
        } else if (number == 2){ //if it is 2, print day
            day = "Monday";
            System.out.println("it is " + day);
        } else if (number == 3){ //if it is 3, print day
            day = "Tuesday";
            System.out.println("it is " + day);
        } else if (number == 4) { //if it is 4 print day
            day = "Wednesday";
            System.out.println("it is " + day);
        } else if (number == 5) { //if it is 5, print day
            day = "Thursday";
            System.out.println("it is " + day);
        } else if (number == 6) { //if it is 6, print day
            day = "Friday";
            System.out.println("it is " + day);
        } else if (number == 7) { //if it is 7, print day
            day = "Saturday";
            System.out.println("it is " + day);
        } else {
            System.out.println("Invalid input! Program exiting.");
        }
    }
}
