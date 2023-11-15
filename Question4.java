package Activity.One;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter the number: ");// asking for user input
		int factorialInput = kb.nextInt();
		System.out.println("The factorial of given  number is: " + factorial(factorialInput));

		kb.close();
	}

	public static int factorial(int factorialInput) { // method to call the factorial
		int output = 1;
		if (factorialInput <= 1) { // if the input is 1
			return output;
		} else { // when the input is greater than 1
			output = factorialInput * factorial(factorialInput - 1); // to multiply the number by number-1
		}
		return output;
	}
}