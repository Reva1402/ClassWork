package Activity.One;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter a character: ");// asking for user input
		char userLetter = kb.next().charAt(0);
		char modifiedChar = Character.toLowerCase(userLetter);
		System.out.print("The letter " + userLetter + vowelFinder(modifiedChar));
		kb.close();
	}

	public static String vowelFinder(char modifiedChar) {
		String result = " ";
		if (modifiedChar == 'a' || modifiedChar == 'e' || modifiedChar == 'i' || modifiedChar == 'o'
				|| modifiedChar == 'u') {
			result = " is a Vowel";
		} else {
			result = " is a consonant";
		}
		return result;
	}

}
