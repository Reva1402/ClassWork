package Activity.One;

import java.util.Scanner;

public class Question36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.println("Please enter a number: ");// asking for user input
		double num1 = kb.nextDouble();
		System.out.println(squareRoot(num1));
		kb.close();

	}

	public static double squareRoot(double num1) {
		double sqrootnum1 = 1;
		double count = 1;
		while (count <= num1)
			count++;
		sqrootnum1 = sqrootnum1 * num1 * num1;
		return sqrootnum1;
	}

}
