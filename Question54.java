package Activity.One;

import java.util.Arrays;

public class Question54 {
    public static void main(String[] args) {


        int[] arrayOriginal = {12, 34, 56, 78, 90};
        System.out.println("Original Array is: "+Arrays.toString(arrayOriginal));

        int[] reverseArray = new int[arrayOriginal.length];



            for (int i = 0, j=(arrayOriginal.length-1); i < arrayOriginal.length; i++) {

                    reverseArray[j] = arrayOriginal[i];
                    j--;
                }


            System.out.println("Reversed Array is: "+Arrays.toString(reverseArray));

        }
    }

