package Activity.One;

import java.util.Arrays;
import java.util.Scanner;

public class Question52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter the length of the array: ");
		int arrayOneLength = kb.nextInt();
		System.out.println();
		int[] arrayNew = new int[arrayOneLength];
		int count = 0;
		do {
			Scanner kb2 = new Scanner(System.in);
			System.out.print("Please enter the array value: ");
			int oneInput = kb2.nextInt();
			arrayNew[count] = oneInput;
			count++;
		} while (count != arrayOneLength);

		System.out.println("Original Array One is " + Arrays.toString(arrayNew));
		System.out.println("Please enter the index of the element to be inserted: ");
		int index = kb.nextInt();
		if (index < 0 || index > arrayNew.length) {
			System.out.println("Invalid Output.");
		} else {
			System.out.println("Please enter the new value to be inserted at index : " + index);
			int newValue = kb.nextInt();
			arrayNew[index] = newValue;
		}
		System.out.println("Modified Array is: " + Arrays.toString(arrayNew));

	}

}
