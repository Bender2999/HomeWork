package Homework2;

import utils.ArrayUtils;

import java.util.Scanner;

/**
 * Created by User on 21.04.2016.
 */
public class _1_6Homework {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please size your array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        // the generated values for arrays
        array = ArrayUtils.createAndFillRandomArray(size, 1, 50);

        System.out.println(" Array :..");
        ArrayUtils.bubbleSort(array);
        ArrayUtils.printArray(array);
        System.out.println(" ");

        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa = summa + array[i];
        }
        summa = summa / array.length;
        System.out.print("Array : ");
        System.out.println("The simple average in the array: " + summa);
        for (int i = 0; i < size; i++) {
            if (array[i] < summa) {
                System.out.print(" " + array[i]);

            }
        }
    }

}


