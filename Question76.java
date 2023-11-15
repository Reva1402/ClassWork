package Activity.One;
import java.util.Arrays;
public class Question76 {
    public static void main(String[] args) {
        int[] arrayOne = {12, 8, 4, 5, 9, 3, 2, 5, 67, 24};
        System.out.println(Arrays.toString(arrayOne));
        System.out.println("The possible triangles in the given array is: "+noOfTriangles(arrayOne));
    } public static int noOfTriangles(int[] array){
        int count = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        for(i=0; i<array.length;i++){
            for(j=i+1; j<array.length;j++){
                for (k=j+1;k<array.length;k++){
                    if(array[i]+array[j]>array[k] && array[j]+array[k]>array[i]&&array[k]+array[i]>array[i])
                        count++;
                        break;
                    }

                    }
                }
        return count;
        }

    }

