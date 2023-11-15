package Activity.One;

import java.util.Arrays;

public class Question84 {
    public static void main(String[] args) {
        int[] givenArray = {12,2,3,45,78,4,34,99};
        System.out.println("Given Array is: "+Arrays.toString(givenArray));
        System.out.println("Replaced Array is: "+replaceValue(givenArray));
        int[] givenArrayTwo = {12,2,3,45,5,8,12,90,345,3,78,4,34,99};
        System.out.println("Given Array is: "+Arrays.toString(givenArray));
        System.out.println("Replaced Array is: "+replaceValue(givenArrayTwo));
        int[] givenArrayThree = {24,8,45,1,0,5,123,12,2,3,45,78,4,34,99};
        System.out.println("Given Array is: "+Arrays.toString(givenArray));
        System.out.println("Replaced Array is: "+replaceValue(givenArrayThree));

    } public static String replaceValue(int[] array){
        int i = 0;
        int j = 0;
        int count = array.length-1;
        int max = array[0];
        Arrays.sort(array);
        int [] replacedArray = new int[array.length];
        int[] organisedArray = new int[array.length];
        for(i=0;i<array.length;i++){
            replacedArray[i]=array[count];
            count=count-1;
        }
        for(j=0;j<array.length;j++){
            organisedArray[j]=replacedArray[j];
        }
        organisedArray[replacedArray.length-1]=-1;
        return Arrays.toString(organisedArray);
    }
}
