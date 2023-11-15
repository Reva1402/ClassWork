package Activity.One;

import java.util.Scanner;

public class Question49 {

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
		System.out.println("Please enter the value to find the index: ");
		int numCheck = kb.nextInt();

		for (i = 0; i < a1.length; i++) {
			if (numCheck == a1[i]) {
				is_True = true;

				break;
			} else {
				is_True = false;

			}

		}
		if (is_True = true) {
			System.out.println("The index of " + numCheck + " is " + (i) + " in the given array.");
		} else {
			System.out.println("Invalid input");
		}

	}

}
