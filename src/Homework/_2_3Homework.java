package Homework;
import java.util.Scanner;

/**
 * Created by User on 12.04.2016.
 */
public class _2_3Homework {

        public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter number ");
            double number = scanner.nextDouble();

            if (number % 7 == 0 & number != 0){
                System.out.println("Congratulations your result "+ (number * 2));
            }else {
                System.out.print("Sorry you enter number " + number);
                System.out.println(" cannot be divided into 7...");
            }
        }


    }
