package Activity.One;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Question50 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter the length of the array: ");
		int arr1Length = kb.nextInt();
		System.out.println();
		int[] arr1 = new int[arr1Length];
		int k = 0;
		for (int j = 0; j < arr1Length; j++) {
			Scanner kb2 = new Scanner(System.in);
			System.out.print("Enter the array value: ");
			int arr1Input = kb2.nextInt();
			arr1[j] = arr1Input;
		}

		System.out.println("The original array is: " + Arrays.toString(arr1));
		Scanner kb3 = new Scanner(System.in);
		System.out.print("Enter the array value to remove: ");
		int arr1Check = kb3.nextInt();
		int counter = 0;
		int count = 0;
		do {
			if (arr1[counter] == arr1Check) {
				count = count + 1;
			}
			;
			counter++;

		} while (counter < arr1Length);

		int newLength = (arr1Length) - count;
		int[] modifiedArr = new int[newLength];
		for (int a = 0, b = 0; a < arr1Length; a++) {
			if (arr1[a] == arr1Check) {
				continue;
			}
			modifiedArr[b++] = arr1[a];

		}
		System.out.println("The new array after removing " + arr1Check + " value is: " + Arrays.toString(modifiedArr));
		
		int [] nums = {12,34,65,6,23,7,8,90,234,90};
		int numCheck = 6;
		int index = -1;
		
		System.out.println("Original Array is: "+Arrays.toString(nums));
		
		if(index!=-1) {
			
			int [] newArray = new int [nums.length-1];
			int newIndex = 0;
			for(int i = 0; i<nums.length; i++) {
				if(i==numCheck) {
					newArray[newIndex]=nums[i];
					newIndex++;
					
		}
			
		}System.out.println("New Array is: "+Arrays.toString(newArray));

	} 

}
}
