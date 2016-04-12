package Homework;
import java.util.Scanner;

/**
 * Created by User on 12.04.2016.
 */
public class _2_6Homework {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter first number for 11 to 19 :");
            int a = scanner.nextInt();
            System.out.println("Please enter second number for 11 to 19 ;");
            int b = scanner.nextInt();

            if (a < 11 | a > 19 | b < 11 | b > 19) {
                System.out.println("ERROR ENTER Number not for 11 to 19");
            }else{
                System.out.println("Congratulations "+ a +"+"+ b +"="+ (a + b));
            }
        }
    }

