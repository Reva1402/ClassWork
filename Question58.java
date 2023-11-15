package Activity.One;

import java.util.Arrays;
import java.util.Scanner;

public class Question58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter the length of the array: ");
		int arrayOneLength = kb.nextInt();
		System.out.println();
		int[] newArray1 = new int[arrayOneLength];
		int count = 0;
		do {
			Scanner kb2 = new Scanner(System.in);
			System.out.print("Please enter the array value: ");
			int oneInput = kb2.nextInt();
			newArray1[count] = oneInput;
			count++;
		} while (count != arrayOneLength);
		System.out.print("Please enter the length of the array: ");
		int arrayTwoLength = kb.nextInt();
		System.out.println();
		int[] newArray2 = new int[arrayTwoLength];
		int counter = 0;
		do {
			Scanner kb2 = new Scanner(System.in);
			System.out.print("Please enter the array value: ");
			int twoInput = kb2.nextInt();
			newArray2[counter] = twoInput;
			counter++;
		} while (counter != arrayTwoLength);
		
		System.out.println("First Array is: " + Arrays.toString(newArray1));
		System.out.println("Second Array is: " + Arrays.toString(newArray2));
		for (int i = 0; i < newArray1.length; i++) {
			for (int j = 0; j < newArray2.length; j++) {
				if ((newArray1[i] == newArray2[j])) {
					System.out.println("Common Elements in the given arrays is: " + newArray2[j]);
				}
			}

		}


	}

}
