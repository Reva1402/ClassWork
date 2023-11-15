package Activity.One;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter the string inputs: ");// asking for user input
		String str1 = kb.nextLine();
		String str2 = kb.nextLine();
		System.out.print("The given two strings " + str1 + " , " + str2 + stringEquality(str1, str2));
		kb.close();
	}

	public static String stringEquality(String str1, String str2) {
		String result = " ";
		if (str1.equals(str2)) {
			result = " are equal.";
		} else {
			result = " are not equal.";
		}
		return result;
	}

}
