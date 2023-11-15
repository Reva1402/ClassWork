package Activity.One;

import java.util.Arrays;

public class Question71 {
    public static void main(String[] args) {
        int [] arrayOne = {1,2,-1,8,23,0,5,6,34,77};
        int [] arrayTwo = {23,65,45,6,712,77,12,32};
        int [] arrayThree = {12,65,-1,34,66,22};
        System.out.println("Array 1 : "+ Arrays.toString(arrayOne));
        System.out.println("Array 1 : "+arrayContains(arrayOne));
        System.out.println("Array 2 : "+ Arrays.toString(arrayTwo));
        System.out.println("Array 2 : "+arrayContains(arrayTwo));
        System.out.println("Array 3 : "+ Arrays.toString(arrayThree));
        System.out.println("Array 3 : "+arrayContains(arrayThree));

    }public static String arrayContains(int[] arrayGiven){
        String result = " ";
//        int[]testingArray = new int [arrayGiven.length];
//        for(int k = 0;k<arrayGiven.length; k++){
//            testingArray[k]=arrayGiven[k];
//        }
        int count=0;

        for(int i = 0; i<arrayGiven.length; i++){
            if((arrayGiven[i]==65 || arrayGiven[i]==77 ) ) {
                count++;
            }

        }

        if(count>1){
             result = "has specified values of 65 and 77 values in the array elements.";
        }else{
             result="does not have specified values of 65 and 77 values in the array elements.";

        }
        return  result;



    }
}
