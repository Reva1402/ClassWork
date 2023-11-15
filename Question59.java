package Activity.One;

import java.util.Arrays;

public class Question59 {
    public static void main(String[] args) {
        int [] arrayOne = {12,23,34,45,56,67,78,89,90,12,4,12,5};
        System.out.println("Array One is: "+ Arrays.toString(arrayOne));
        int count = 0;
        int[] testArray = new int[arrayOne.length];
        int i = 0;
        int j,k =0;
        int counter=0;
        for(i = 0; i<arrayOne.length;i++){
            testArray[i]=arrayOne[i];
        }
        for( j = 0, k = 0; j<arrayOne.length; j++){
            if(testArray[j]==arrayOne[k] && j!=k){
                counter= counter+1;
            }
        } counter = counter+1;

        System.out.println("Duplicate element found is: "+testArray[k]+",repeated "+ counter+" times.");
        int checkElement = testArray[k];
        int newLength = arrayOne.length-counter+1;
        int [] newArray = new int[newLength];
        for(int p = 0, d=0; p<testArray.length;p++){
           if(testArray[p]==checkElement){
               continue;
           }newArray[d++]=testArray[p];
           newArray[newArray.length-1]=checkElement;
        }
        System.out.println("Array after removing duplicate items: "+Arrays.toString(newArray));
    }


}
