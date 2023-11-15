package Activity.One;

import java.util.Arrays;


public class Question72 {
    public static void main(String[] args) {
        int[] arrayOne = {12, 34, 2, 9, 2, 34, 67, 34, 9, 45, 34};
        int[] arrayTwo = {10, 20, 20, 30, 40, 50, 50, 50, 30};
        int[] arrayThree = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("The First Array is: " + Arrays.toString(arrayOne));
        System.out.println("The First array after removing duplicate elements is: " + duplicateFinder(arrayOne));
        System.out.println("The Second Array is: " + Arrays.toString(arrayTwo));
        System.out.println("The Second array after removing duplicate elements is: " + duplicateFinder(arrayTwo));
        System.out.println("The Third Array is: " + Arrays.toString(arrayThree));
        System.out.println("The Third array after removing duplicate elements is: " + duplicateFinder(arrayThree));

    }

    public static String duplicateFinder(int[] givenArray) {
        int count = 0;
        int value = 0;
        int p = 0;
        int pk = 0;
        int[] arrayTwo = new int[givenArray.length];
        for (int j = 0; j < givenArray.length; j++) {
            for (int k = j + 1; k < givenArray.length; k++) {
                if ((givenArray[j] == givenArray[k])) {
                    if (j != k) {
                        int duplicateValue = givenArray[k];
                    }
                    if (j != k) {
                        for (p = pk; p < givenArray.length; p++) {
                            arrayTwo[p] = givenArray[k];
                            pk++;
                            break;
                        }
                    }
                    count = count + 1;
                    value = givenArray[k];
                    break;
                }
            }
        }
        if (count == 0) {
            return "There are no duplicate elements.";
        } else {
            return "The updated new length of the array is: " + (givenArray.length-count);

        }
    }
}


