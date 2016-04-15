package Homework;
import java.util.Scanner;
/**
 * Created by User on 15.04.2016.
 */
public class _2_8Homework {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter first number: ");
            int first = scanner.nextInt();
            System.out.println("Please enter second number: ");
            int second = scanner.nextInt();


            //finding the remainder of the division two numbers
                double one = first % 10;
                double two = second % 10;

            if (one == two & one !=0 & two !=0) {
                System.out.println("Congratulation your numbers have in suffix digit : " +(int)one);
            }else{
                System.out.println("Sorry not found digit in suffix...");
            }


        }

    }


