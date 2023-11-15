package Activity.One;

import java.util.Arrays;

public class Question81A {
    public static void main(String[] args) {
        int[] arrayOne = {2, 3, -9, 5, 23, 56, -5};
        System.out.println("Given Array One is: " + Arrays.toString(arrayOne));
        System.out.println("Organised Array One with Highest and lease values is:" + organiserArray(arrayOne));
        int[] arrayTwo = {1, 2, 3, 4, 5};
        System.out.println("Given Array Two is: " + Arrays.toString(arrayTwo));
        System.out.println("Organised Array Two with Highest and lease values is:" + organiserArray(arrayTwo));
        int[] arrayThree = {1, 2, 3, 4, 5, 6};
        System.out.println("Given Array Two is: " + Arrays.toString(arrayThree));
        System.out.println("Organised Array Two with Highest and lease values is:" + organiserArray(arrayThree));

    }

    public static String organiserArray(int[] givenArray) {
        Arrays.sort(givenArray);
        int[] ascendingArray = givenArray;
        int replace = givenArray.length - 1;
        int[] descendingArray = new int[givenArray.length];
        int j, c;
        int k = 0;
        int p = 0;
        int[] organisedArray;

        if (givenArray.length % 2 == 0) {
            for (int i = 0; i < givenArray.length; i++) {
                descendingArray[i] = ascendingArray[replace];
                replace = replace - 1;
            }
            organisedArray = new int[givenArray.length];
            for (j = 1; j <= (givenArray.length / 2); j++) {
                organisedArray[k] = descendingArray[j - 1];
                k = k + 2;
            }
            for (c = 1; c < (givenArray.length / 2) + 1; c++) {
                organisedArray[p + 1] = ascendingArray[c - 1];
                p = p + 2;
            }
        } else {
            for (int i = 0; i < givenArray.length; i++) {
                descendingArray[i] = ascendingArray[replace];
                replace = replace - 1;
            }
            organisedArray = new int[givenArray.length];
            for (j = 1; j <= (givenArray.length / 2) + 1; j++) {
                organisedArray[k] = descendingArray[j - 1];
                k = k + 2;
            }
            for (c = 1; c <= (givenArray.length / 2); c++) {
                organisedArray[p + 1] = ascendingArray[c - 1];
                p = p + 2;
            }
        }
//        System.out.println("Ascending Order: " + Arrays.toString(ascendingArray));
//        System.out.println("Descending Order: " + Arrays.toString(descendingArray));
        return Arrays.toString(organisedArray);
    }

}





