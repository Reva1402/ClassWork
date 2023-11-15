package Activity.One;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter the value of a: ");// asking for user input
		int a = kb.nextInt();
		System.out.print("Please enter the value of b: ");// asking for user input
		int b = kb.nextInt();
		System.out.println("The addition is " + addition(a, b));
		System.out.println("The subtraction is " + subtraction(a, b));
		System.out.println("The multiplication is " + multiplication(a, b));
		System.out.println("The division is " + division(a, b));
		kb.close();

	}

	public static int addition(int a, int b) {
		int c = a + b;
		return c;

	}

	public static int subtraction(int a, int b) {
		int c = a - b;
		return c;

	}

	public static int multiplication(int a, int b) {
		int c = a * b;
		return c;

	}

	public static int division(int a, int b) {
		int c = a / b;
		return c;

	}
}
