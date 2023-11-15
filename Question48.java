package Activity.One;

import java.util.Scanner;

public class Question48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter the length of the array: ");
		int a1Length = kb.nextInt();
		System.out.println();
		int[] a1 = new int[a1Length];
		int count = 0;
		boolean is_True;
		int i;
		do {
			Scanner kb2 = new Scanner(System.in);
			System.out.print("Enter the array value: ");
			int a1Input = kb2.nextInt();

			a1[count] = a1Input;
			count++;
		} while (count < a1Length);
		System.out.println("Please enter the value to check: ");
		int numCheck = kb.nextInt();
		for (i = 0; i < a1.length; i++) {
			if (a1[i] == numCheck) {
				is_True = true;

				break;
			}
//			if (is_True) {
//				System.out.println(
//						"The value of " + numCheck + " is present at the index of " + (i) + " in the given array.");
//			} else {
//				System.out.println("The array does not contains the value of " + numCheck);
//			}

		}

	}
}
