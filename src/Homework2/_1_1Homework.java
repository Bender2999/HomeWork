package Homework2;
import utils.ArrayUtils;
/**
 * Created by User on 19.04.2016.
 */
public class _1_1Homework {
    public static void main(String[] args) {
        int[] nums = ArrayUtils.createAndFillRandomArray(10, 5, 50);
        ArrayUtils.printArray(nums);
        ArrayUtils.bubbleSort(nums);
        ArrayUtils.printArray(nums);
        System.out.println("1.Output result min & max numbers from array: ");
        System.out.println("            minimal number in the array: " + nums[0]);
        System.out.println("            maximal number in the array: " + nums[(nums.length - 1)]);

        int summa = 0;
          for (int i = 0; i < nums.length; i++) {
               summa = summa + nums[i];
          }
        summa = summa / nums.length;
        //Find the simple average..
        System.out.println("2.The simple average in the array: " + summa);
        //Swap cells in the array
        System.out.println(" ");
        System.out.println("3.Swap cells in the array..");
        ArrayUtils.cellSwap(nums);
        ArrayUtils.printArray(nums);

    }
}
