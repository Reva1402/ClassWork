package Activity.One;

import java.util.Arrays;

public class Question79 {
    public static void main(String[] args) {
        int[] arrayOne = {12, -8, 4, 5, -9, -3, 2, 5, 67, 0,34,5,6,-95,-3,2345};
        System.out.println("Given Array One is: " + Arrays.toString(arrayOne));
        System.out.println("Positive Values sorted array is: " + negativeIntegers(arrayOne));
        int[] arrayTwo = {12, -8, 4, 5, -9, -3, 2, 5, 67, -23,-6,12,45,7,0, 5, -9, -3};
        System.out.println("Given Array One is: " + Arrays.toString(arrayTwo));
        System.out.println("Positive Values sorted array is: " + negativeIntegers(arrayTwo));

    }
    public static String negativeIntegers(int[] array) {
        int count = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] positveArray = new int[array.length];
        for (i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                positveArray[j] = array[i];
                j++;
                count = j + 1;
            }
        }
        for (k = 0; k < array.length; k++) {
            if (array[k] >= 0) {
                positveArray[j] = array[k];
                j++;
            }
        }
        return Arrays.toString(positveArray);
    }
}

