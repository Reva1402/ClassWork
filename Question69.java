package Activity.One;

import java.util.Arrays;

public class Question69 {
    public static void main(String[] args) {
        int [] arrayOne = {1,2,-1,8,23,0,5,6,34};
        int [] arrayTwo = {23,45,6,712,67,12,0,32};
        int [] arrayThree = {12,-1,34,66,22};
        System.out.println("Array 1 : "+ Arrays.toString(arrayOne));
        System.out.println("Array 1 : "+arrayContains(arrayOne));
        System.out.println("Array 2 : "+ Arrays.toString(arrayTwo));
        System.out.println("Array 2 : "+arrayContains(arrayTwo));
        System.out.println("Array 3 : "+ Arrays.toString(arrayThree));
        System.out.println("Array 3 : "+arrayContains(arrayThree));

    } public static String arrayContains(int[] arrayGiven){
        String result = " ";
        int count = 0;
        for(int i = 0; i<arrayGiven.length; i++){
            if((arrayGiven[i]==0 || arrayGiven[i]==-1)){
                count++;
            }
        }
        if(count>1){
            result =  " has specified values of 0 and -1 values in the array elements.";
        }else{
           result= " does not has specified values of 0 and -1 values in the array elements.";
        }
        return  result;
    }
}
