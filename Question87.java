package Activity.One;

import java.util.Scanner;

public class Question87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter a number of inputs to know the sum: ");// asking for user input
		int noOfInputs = kb.nextInt();
		System.out.println("The Sum of given numbers is: " + sumOfInputs(noOfInputs));
		System.out.print("Please enter a number of inputs to know the average: ");// asking for user input
		int noOfInputs1 = kb.nextInt();
		System.out.println("The Average of given numbers is: " + averageOfInputs(noOfInputs1));
		kb.close();
	}

	public static int sumOfInputs(int noOfInputs) {
		Scanner kb1 = new Scanner(System.in);
		int i = 1;
		int j = 0;
		for (i = 1; i <= noOfInputs; i++) {
			System.out.print("Enter the number " + i + ": ");
			int input = kb1.nextInt();
			while (j == noOfInputs)
				;
			j++;
			j = (j - 1) + input;

		}
		return j;

	}

	public static int averageOfInputs(int noOfInputs1) {
		Scanner kb2 = new Scanner(System.in);
		int i = 1;
		int j = 0;
		for (i = 1; i <= noOfInputs1; i++) {
			System.out.print("Enter the number " + i + ": ");
			int input = kb2.nextInt();
			while (j == noOfInputs1)
				;
			j++;
			j = (j - 1) + input;

		}
		j = j / noOfInputs1;
		return j;

	}
}
