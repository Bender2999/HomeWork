package utils;

public class ArrayUtils {

        public static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        public static void printArray(String[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();

        }
        public static void printArray(char[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();

        }

        public static int[] createFileArrey(int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }
            return array;
        }

        public static int[] createAndFillRandomArray(int size, int min, int max){
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = (int) (min + Math.random() * (max - min));
            }
            return array;
        }
        // I not understand how to make it work..!!
        //public static int [] simpleAverage(int[] array){
        //    int summa = 0;
        //   for (int i = 0; i < array.length; i++) {
        //        summa += i;
        //    }
        //   return array;
        //}

        public static void bubbleSort(int[] array) {
            for (int j = array.length; j > 0; j--) {
                for (int i = 0; i < j - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        //      swap
                        int tmp = array[i + 1];
                        array[i + 1] = array[i];
                        array[i] = tmp;
                    }

                }
            }
        }
        public static void cellSwap(int[] array) {
            int tmp = array[array.length - 1];
            array[array.length - 1] = array[0];
            array[0] = tmp;

        }

}



