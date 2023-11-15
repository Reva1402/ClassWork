package Activity.One;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter a year: ");// asking for user input
		int yearInput = kb.nextInt();
		System.out.print("The year " + yearInput + leapYear(yearInput));
		kb.close();
	}
	public static String leapYear(int yearInput) {
		String result = " ";
		if (yearInput % 4 == 0) {
			result = " is a leap year.";
		} else {
			result = " is not a leap year.";
		}
		return result;
	}
}
