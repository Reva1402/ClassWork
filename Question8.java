package Activity.One;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter an input: ");// asking for user input
		double num1 = kb.nextDouble();
		if (num1 < 1) {
			System.out.println("This is not a valid input");
		}
		System.out.println(squareRoot(num1));
		kb.close();

	}

	public static double squareRoot(double num1) {
		double sqnum;
		sqnum = Math.sqrt(num1);
		return sqnum;
	}

}
