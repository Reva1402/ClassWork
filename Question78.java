package Activity.One;

import java.util.Arrays;

public class Question78 {
    public static void main(String[] args) {
        int[] givenArray = {12,16,18,3,4,7,9,10,11};
        int n = givenArray.length;
        System.out.println("Original Array is: "+ Arrays.toString(givenArray));
        System.out.println("Number of Rotations is: "+arrayRotation(givenArray,n));

        int[] givenArrayOne = {12,1,3,4,7,9,10,11};
        int n1 = givenArray.length;
        System.out.println("Original Array is: "+ Arrays.toString(givenArrayOne));
        System.out.println("Number of Rotations is: "+arrayRotation(givenArrayOne,n1));

        int[] givenArrayTwo = {12,16,18,20,21,0,3,4,7,9,10,11};
        int n2 = givenArray.length;
        System.out.println("Original Array is: "+ Arrays.toString(givenArrayTwo));
        System.out.println("Number of Rotations is: "+arrayRotation(givenArrayTwo,n2));

    } public static int arrayRotation(int[] givenArray, int minIndex){
        int i = 0;
        int min = givenArray[0];
       minIndex=-1;
        for(i = 0; i<givenArray.length;i++){
            if(min>givenArray[i]){
                min = givenArray[i];
                minIndex=i;
            }
        }
        return minIndex;
    }
}
