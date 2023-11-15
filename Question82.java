package Activity.One;

import java.util.Arrays;

public class Question82 {
    public static void main(String[] args) {
        int[] givenArray = {0,1,1,0,1,0,0,0};
        System.out.println(zerosOnes(givenArray));
        int[] givenArrayTwo = {0,1,1,0,1,0,0,0,1,1,1,1,1,0,0,0,0,0};
        System.out.println(zerosOnes(givenArrayTwo));
        }
    public static String zerosOnes(int[] array){
        int i = 0;
        int j = 0;
        int [] sortedArray = new int[array.length];
        for(i=0; i<array.length;i++){
            if(array[i]==0){
                sortedArray[j]=array[i];
                j++;
            }
        }
        for(int k = 0; k<array.length;k++){
            if(array[k]==1){
                sortedArray[j]=array[k];
                j++;
            }

        } return Arrays.toString(sortedArray);

    }
}
