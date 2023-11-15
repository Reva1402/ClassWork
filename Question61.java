package Activity.One;

import java.util.Arrays;
import java.util.Scanner;

public class Question61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter the length of the array: ");
		int arrayOneLength = kb.nextInt();
		System.out.println();
		int[] arrayOne = new int[arrayOneLength];
		int count = 0;
		do {
			Scanner kb2 = new Scanner(System.in);
			System.out.print("Please enter the array value: ");
			int oneInput = kb2.nextInt();
			arrayOne[count] = oneInput;
			count++;
		} while (count != arrayOneLength);

		System.out.println("Original Array One is " + Arrays.toString(arrayOne));
		Arrays.sort(arrayOne);
		System.out.println("Sorted Array One is " + Arrays.toString(arrayOne));
		System.out.println("The Second Smallest value in the given array is: " + arrayOne[1]);

	}

}
