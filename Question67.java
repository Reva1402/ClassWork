package Activity.One;

import java.util.Arrays;
import java.util.Scanner;

public class Question67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter the length of the array: ");
		int arrayOneLength = kb.nextInt();
		System.out.println();
		int[] newArray = new int[arrayOneLength];
		int count = 0;
		do {
			Scanner kb2 = new Scanner(System.in);
			System.out.print("Please enter the array value: ");
			int oneInput = kb2.nextInt();
			newArray[count] = oneInput;
			count++;
		} while (count != arrayOneLength);
		System.out.println("Original Array is: " + Arrays.toString(newArray));

		Arrays.sort(newArray);
		System.out.println("Sorted Array is: " + Arrays.toString(newArray));
		System.out.println("The difference between largest and smallest in the array values is: "
				+ (newArray[newArray.length - 1] - newArray[0]));
//	        

	}

}
