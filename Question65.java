package Activity.One;

import java.util.Arrays;

public class Question65 {
    public static void main(String[] args) {
        int[] arrayValues = {2, 0, 3, -4, 0, 5, 1, 0, -9};
        System.out.println("Given Array is: " + Arrays.toString(arrayValues));
        int arrayValueLen = arrayValues.length;
        int count = 0;
        for (int i = 0; i < arrayValueLen; i++) {
            if (arrayValues[i] == 0) {
                count = count + 1;
            }
        }
        int[] arrayWithoutZero = new int[arrayValueLen - count];
        for (int k = 0, j = 0; k < arrayValueLen; k++) {
            if (arrayValues[k] == 0) {
                k = k;
            } else {
                arrayWithoutZero[j++] = arrayValues[k];
            }
        }
        Arrays.sort(arrayWithoutZero);
        int finalArrayLength = arrayWithoutZero.length + count;
        int[] finalArray = new int[finalArrayLength];
        for (int l = 0, s = 0; l < arrayWithoutZero.length; l++) {
            finalArray[s++] = arrayWithoutZero[l];
        }
        System.out.println("Arrays with zeros at end of the Array: " + Arrays.toString(finalArray));

    }
}