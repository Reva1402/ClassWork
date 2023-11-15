package Activity.One;

import java.util.Arrays;

public class Question83 {
    public static void main(String[] args) {
        int[] arrayOne = {12, 8, 4, 5, 9, 3, 2, 5, 67, 24};
        System.out.println("Given Array One is: " + Arrays.toString(arrayOne));
        System.out.println("Even and Odd Values sorted array is: " + evenANDodd(arrayOne));

    } public static String evenANDodd(int[] array){
        int count = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] organisedArray = new int[array.length];
        for (i = 0; i < array.length; i++) {
            if (array[i]%2==0) {
                organisedArray[j] = array[i];
                j++;
                count = j + 1;

            }
        }
        for (k = 0; k < array.length; k++) {
            if (array[k]%2!=0) {
                organisedArray[j] = array[k];
                j++;
            }
        }
        return Arrays.toString(organisedArray);
    }
}
