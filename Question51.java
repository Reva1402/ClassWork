package Activity.One;

import java.util.Arrays;
import java.util.Scanner;

public class Question51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Scanner kb = new Scanner(System.in);
	        System.out.print("Please enter the length of the array: ");
	        int arrayOneLength = kb.nextInt();
	        System.out.println();
	        int[] arrayOne = new int[arrayOneLength];
	        int count = 0;
	        do{
	            Scanner kb2 = new Scanner(System.in);
	            System.out.print("Please enter the array value: ");
	            int oneInput = kb2.nextInt();
	            arrayOne[count]=oneInput;
	            count++;
	        } while(count!=arrayOneLength);

	        System.out.println("Original Array One is "+Arrays.toString(arrayOne));
	        int [] arrayTwo = new int[arrayOneLength];
	        for(int i = 0; i<arrayOne.length;i++){
	            arrayTwo[i]= arrayOne[i];
	        }

	        arrayOne[3] = 123;

	        System.out.println("Modified Array One is: "+Arrays.toString(arrayOne));
	        System.out.println("Array Two with same as Array One elements  is: "+Arrays.toString(arrayTwo));



	    

}

}
