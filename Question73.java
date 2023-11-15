package Activity.One;

import java.util.Arrays;

public class Question73 {
    public static void main(String[] args) {
        int[] arrayOne = {2, 4, 9, 3, 0, 5, 7, 6, 21, 8};
        int length = arrayOne.length;
        System.out.println("The length is the consecutive elements in the given array is: " + consecutiveLength(arrayOne));
    }

    public static int consecutiveLength(int[] givenArray) {

        Arrays.sort(givenArray);
        System.out.println(Arrays.toString(givenArray));
        int i = 0;
        int j = 0;
        int length = 0;
        for (i = 0; i < givenArray.length; i++) {
            for (j = i + 1; j < givenArray.length; j++) {
                if (givenArray[i] + 1 == givenArray[j]) {
                    length = length + 1;
                    break;
                }
            }
        }
        length = length + 1;
        System.out.println(length);
        return length;
    }
}
