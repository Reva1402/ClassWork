package Activity.One;

import java.util.Scanner;

public class Question42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter the base number: ");// asking for user input
		int baseNum = kb.nextInt();
		System.out.print("Please enter the exponent: ");// asking for user input
		int exponent = kb.nextInt();
		System.out.print("The power of " + baseNum + " to the power of " + exponent + " is "
				+ calculatePower(baseNum, exponent));
		kb.close();

	}

	public static long calculatePower(int baseNum, int exponent) {
		long result = 1;
		int count = 1;
		do {
			result = result * baseNum;
			count++;

		} while (count <= exponent);
		return result;

	}
}
