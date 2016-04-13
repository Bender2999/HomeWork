package Homework;
import java.util.Scanner;

/**
 * Created by User on 13.04.2016.
 */
public class _2_7Homework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int b = scanner.nextInt();
        int big, small;
        //finding greatest and smallest numbers
        if (a > b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }
        boolean result = big % small == 0;
        if (big % small == 0 & big != 0){
            System.out.println("Congatulations = :" + result);
            System.out.println("the remainder of the division: "+ (big % small));
            System.out.println("the result of the division: " + (big / small));
        }else{
            System.out.println("Sorry, the remainder of the division; = "+ result);
            System.out.println("the remainder of the division: "+ (big % small));
            System.out.println("the result of the division: " + (big / small));
        }




    }

}


