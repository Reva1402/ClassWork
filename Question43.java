package Activity.One;

import java.util.Scanner;

public class Question43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter the base number: ");// asking for user input
		int baseNum = kb.nextInt();

		System.out.print("The square of " + baseNum + " is " + squareValue(baseNum));
		kb.close();

	}

	public static double squareValue(int baseNum) {
		double result = 1;
		int count = 1;
		do {
			result = result * baseNum * baseNum;
			count++;

		} while (count <= 0);
		return result;

	}
}
