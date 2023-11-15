package Activity.One;

import java.util.Arrays;

public class Question77 {
    public static void main(String[] args) {
        int[] givenArray = {12,2,3,45,78,4,34,99};
        System.out.println("Original Array is: "+Arrays.toString(givenArray));
        System.out.println("Clockwise Rotated Array is: "+rotateArray(givenArray));
        int[] givenArrayTwo = {12,2,3,45,5,8,12,90,345,3,78,4,34,99};
        System.out.println("Original Array is: "+Arrays.toString(givenArrayTwo));
        System.out.println("Clockwise Rotated Array is: "+rotateArray(givenArrayTwo));
        int[] givenArrayThree = {24,8,45,1,0,5,123,12,2,3,45,78,4,34,99};
        System.out.println("Original Array is: "+Arrays.toString(givenArrayThree));
        System.out.println("Clockwise Rotated Array is: "+rotateArray(givenArrayThree));

    } public static String rotateArray(int[] givenArray){
        int i = 0;
        int j = 1;
        int k = 0;
        int [] rotatedArray = new int[givenArray.length];
        for(i=0; i<givenArray.length-1;i++){
            rotatedArray[j]=givenArray[i];
            j++;
        }
        rotatedArray[rotatedArray.length-1]=givenArray[givenArray.length-2];
        rotatedArray[0]=givenArray[givenArray.length-1];
        return Arrays.toString(rotatedArray);
    }
}
