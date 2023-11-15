package Activity.One;

import java.util.Arrays;

public class Question64 {
    public static void main(String[] args) {
        int [] arrayOne = {12,3,4,0,6,7,8};
        System.out.println("Given Array is: "+ Arrays.toString(arrayOne));
        double sumOne = 45.0;
        double sum=0;
        for(int n : arrayOne){
            sum = sum+n;
        }
        double missingNum = sumOne-sum;
        int missNum = (int) missingNum;
        System.out.println("Missing number in the Array is: "+missNum);
        for(int i = 0; i<arrayOne.length; i++){
            if(arrayOne[i]==0){
                arrayOne[i]=missNum;
            }
        }
        System.out.println("Updated Array with missing number is: "+Arrays.toString(arrayOne));
    }
}
