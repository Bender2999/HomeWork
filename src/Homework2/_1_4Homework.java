package Homework2;

import utils.ArrayUtils;

import java.util.Scanner;

/**
 * Created by User on 21.04.2016.
 */
public class _1_4Homework {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please size your array: ");
        int size = scanner.nextInt();
        int[] array1 = new int[size];
        int[] array2 = new int[size];
     // the generated values for arrays
             array1 =  ArrayUtils.createAndFillRandomArray(size, 1, 50);
             array2 =  ArrayUtils.createAndFillRandomArray(size, 1, 50);

                System.out.println(" Array 1:..");
                    ArrayUtils.printArray(array1);
                System.out.println(" Array 2:..");
                    ArrayUtils.printArray(array2);
                array2 = array1;
             for (int i = 0; i < size ; i++) {
                 System.out.println(" Please Wait is copyng date...");
                 Thread.sleep(500);
                 System.out.println("");
                 System.out.println("");
             }

                System.out.println(" Array 1:..");
                     ArrayUtils.printArray(array1);
                System.out.println(" Array 2:..");
                     ArrayUtils.printArray(array2);





    }

}
