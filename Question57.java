package Activity.One;

import java.util.Scanner;
import java.util.Arrays;

public class Question57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter the length of the first array: ");
		int arrayOneLength = kb.nextInt();
		System.out.println();
		String[] newArray1 = new String[arrayOneLength];
		int count = 0;
		do {
			Scanner kb2 = new Scanner(System.in);
			System.out.print("Please enter the string value: ");
			String oneInput = kb2.nextLine();
			newArray1[count] = oneInput;
			count++;
		} while (count != arrayOneLength);

		System.out.print("Please enter the length of the second array: ");
		int arrayTwoLength = kb.nextInt();
		System.out.println();
		String[] newArray2 = new String[arrayTwoLength];
		int counts = 0;
		do {
			Scanner kb3 = new Scanner(System.in);
			System.out.print("Please enter the string value: ");
			String twoInput = kb3.nextLine();
			newArray2[counts] = twoInput;
			counts++;
		} while (counts != arrayTwoLength);

		System.out.println("Array One is: " + Arrays.toString(newArray1));
		System.out.println("Array Two is: " + Arrays.toString(newArray2));

		for (int i = 0; i < newArray1.length; i++) {
			for (int j = 0; j < newArray2.length; j++) {
				if ((newArray1[i].equals(newArray2[j])) && ((i != j))) {

					System.out.println("Common Elements in the given array is: '" + newArray2[j] + " ' ");
				}
			}

		}

	}

}
