package Activity.One;

import java.util.Arrays;
import java.util.Scanner;

public class Question53 {

	public static void main(String[] args) {

		int[] testArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 120 };
		findMax(testArray);
		int min =findMin(testArray);
		System.out.println(Arrays.toString(testArray));
		System.out.println(findMax(testArray));
		System.out.println(min);

		// TODO Auto-generated method stub
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Please enter the length of the array: ");
//        int arrayOneLength = kb.nextInt();
//        System.out.println();
//        int[] arrayOne = new int[arrayOneLength];
//        int count = 0;
//        do{
//            Scanner kb2 = new Scanner(System.in);
//            System.out.print("Please enter the array value: ");
//            int oneInput = kb2.nextInt();
//            arrayOne[count]=oneInput;
//            count++;
//        } while(count!=arrayOneLength);
//
//        System.out.println("Original Array One is "+Arrays.toString(arrayOne));
//        Arrays.sort(arrayOne);
//        System.out.println("Sorted Array One is "+Arrays.toString(arrayOne));
//        System.out.println("The Maximum value in the given array is: "+arrayOne[arrayOneLength-1]);
//        System.out.println("The Minimum value in the given array is: "+arrayOne[0]);

	}

	public static int findMax(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				;
			max = array[i];
		}
		return max;

	}

	public static int findMin(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;

	}

}
