package Activity.One;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter the number: ");// asking for user input
		double userNum = kb.nextDouble();
		System.out.print("The entered number " + userNum + " is " + posZeroNeg(userNum));
		kb.close();
	}
	public static String posZeroNeg(double userNum) {
		String result = " ";
		if (userNum == 0) {
			result = "Zero";
		} else if (userNum < 0) {
			result = "Negative Number";
		} else {
			result = "Positive Number";
		}
		return result;
	}
}
