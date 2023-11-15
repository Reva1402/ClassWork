package Activity.One;
import java.util.Scanner;
import java.util.Arrays;

public class Question55 {

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

		for (int i = 0; i < newArray.length; i++) {
			for (int j = i + 1; j < newArray.length; j++) {
				if ((newArray[i] == newArray[j]) && ((i != j))) {
					System.out.println("Duplicate Element in the given array is: " + newArray[j]);
				}
			}

		}

	}

}
