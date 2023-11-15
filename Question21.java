package Activity.One;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter a number: ");// asking for user input
		int num1 = kb.nextInt();

		System.out.print(multiplesof3_5(num1));
		kb.close();
	}
	public static String multiplesof3_5(int num1) {
		if (num1 % 3 == 0 && num1 % 5 == 0) {
			return num1 + " is a multiple of 3 and 5.";
		} else {
			return num1 + " is not a multiple of 3 and 5";
		}
	}
}
