package Homework;
import java.util.Scanner;

/**
 * Created by User on 12.04.2016.
 */
public class _2_1Homework{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter what time is it now? ");
        int time = scanner.nextInt();
        if (time > 24 | time <= 0) {
            System.out.print("Sorry you enter " + time + " Error input, the day must have only 24 hour ");
            System.out.print("(from 1 to 24)");
        } else if (time > 18 | time < 9) {
            System.out.println("I`m rest");
        } else {
            System.out.println("I`m working");

        }
    }
}
