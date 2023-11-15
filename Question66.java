package Activity.One;

import java.util.Arrays;
import java.util.Scanner;

public class Question66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter the length of the array: ");
		int arrayOneLength = kb.nextInt();
		System.out.println();
		int[] givenArray = new int[arrayOneLength];
		int count = 0;
		do {
			Scanner kb2 = new Scanner(System.in);
			System.out.print("Please enter the array value: ");
			int oneInput = kb2.nextInt();
			givenArray[count] = oneInput;
			count++;
		} while (count != arrayOneLength);
		System.out.println(Arrays.toString(givenArray));
		int evenCount = 0;
		int oddCount = 0;
		int counter = 0;
		do {
			if (givenArray[counter] % 2 == 0) {
				evenCount = evenCount + 1;

			} else {
				oddCount = oddCount + 1;
			}
			counter++;

		} while (counter < arrayOneLength);
		System.out.println("Number of even integers in the given array is: " + evenCount);
		System.out.println("Number of odd integers in the given array is: " + oddCount);

	}

}
