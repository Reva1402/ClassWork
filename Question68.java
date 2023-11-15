package Activity.One;

import java.util.Arrays;

public class Question68 {
    public static void main(String[] args) {
        int[] arrayTest  = {12,4,5,34,99,3,45,67,22};
        System.out.println("Given Array is: "+ Arrays.toString(arrayTest));
        double average = 0;
        Arrays.sort(arrayTest);
        double sum = 0;
        for(int i = 1; i<arrayTest.length-1; i++){
            sum = sum+arrayTest[i];
        }
        System.out.println("Sum of the elements of the array excluding largest and smallest values is: "+ sum);
        double numOfElements = arrayTest.length-2;
        average =sum/numOfElements;
        System.out.println("The Average of the elements of the array excluding largest and smallest values is: "+average);
    }
}
