package Activity.One;

import java.util.Scanner;

public class Question47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter the length of the Array: ");// asking for user input
		int length = kb.nextInt();
		int array1[] = new int[length];
		int count = 0;
		double sum = 0;

		do {
			Scanner kb2 = new Scanner(System.in);
			System.out.println("Please enter the array values: ");
			int arInput = kb2.nextInt();
			array1[count] = arInput;
			count++;
		} while (count != array1.length);

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		for (int j = 0; j < array1.length; j++) {
			sum = sum + array1[j];
		}
		System.out.println("The sum of the array elements is: " + sum);
		System.out.println("The average value of the array elements is: " + sum / array1.length);

	}

}
