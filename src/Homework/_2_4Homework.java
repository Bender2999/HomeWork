package Homework;
import java.util.Scanner;
/**
 * Created by User on 12.04.2016.
 */
public class _2_4Homework {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter number from 0 to 1 ");
            double x = scanner.nextDouble();

            if (x > 1 | x < 0)
                System.out.println("Error ENTER number " + x + " not from 0 to 1");
            else
                System.out.println("Congratulations!!!");
        }
    }
