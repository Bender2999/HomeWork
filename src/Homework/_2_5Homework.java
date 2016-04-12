package Homework;
import java.util.Scanner;
/**
 * Created by User on 12.04.2016.
 */
public class _2_5Homework {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a +"-"+ b +"="+ (a - b));
        }else{
            System.out.println(a +"+"+ b + "="+ (a + b));
        }

    }

}
