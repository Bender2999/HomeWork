package Homework;
import java.util.Scanner;
/**
 * Created by User on 12.04.2016.
 */
public class _2_2Homework {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter first number ");
            int a = scanner.nextInt();
            System.out.println("Please Enter second nummber ");
            int b = scanner.nextInt();
            System.out.println("Please Enter third number ");
            int c = scanner.nextInt();
            int big;
            if (a > b)
                big = a;
            else
                big = b;
            if (big > c)
                System.out.println("Greatest number " + big);
            else
                System.out.println("Greatest number " + c);

            int small;
            if (a < b)
                small = a;
            else
                small = b;
            if (small < c)
                System.out.println("Smallest number " + small);
            else
                System.out.println("Smallest number " + c);

        }
    }

