package Homework;
import java.util.Scanner;

/**
 * Created by User on 12.04.2016.
 */
public class _2_6Homework {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int b = scanner.nextInt();
        int sum = a + b;
        if (sum < 11 | sum > 19) {
            System.out.println("Sorry, - the sum of the two numbers not for 11 to 19");
        }else{
            System.out.println("Congratulations: "+ sum);
        }
    }
}