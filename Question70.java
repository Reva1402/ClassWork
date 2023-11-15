package Activity.One;

import java.util.Arrays;

public class Question70 {
    public static void main(String[] args) {
        int[] arraY1={12,18,3,4,6};
        System.out.println("Given Array One is: "+Arrays.toString(arraY1));
        System.out.println(sumFinder(arraY1));
        int[] arraY2={10,10,10,3,4,5,6,7,8,9,0};
        System.out.println("Given Array Two is: "+Arrays.toString(arraY2));
        System.out.println(sumFinder(arraY2));
        int[] arraY3={3,4,5,6,7,8,9,0,10,45};
        System.out.println("Given Array Three is: "+Arrays.toString(arraY3));
        System.out.println(sumFinder(arraY3));


    } public static boolean sumFinder(int[] givenArray){
        int sum = 0;
        int j = 0;
        boolean is_Value;
        String result = " ";
        for(int i =0; i< givenArray.length; i++){
            if(givenArray[i]>9 && givenArray[i]<20){
                for(j =i; j< givenArray.length; j++){
                    sum = sum+givenArray[j];
                    break;
                }
            }
        }
        if(sum==30){
            is_Value = true;
            result = "The sum of 10's in the array is exactly 30.";
        }else{
            is_Value=false;
            result = "The sum of 10's in the array is not 30.";
        } return is_Value;
    }
}
