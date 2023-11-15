package Activity.One;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter a character: ");// asking for user input
		char userLetter = kb.next().charAt(0);
		char modifiedLetter = Character.toLowerCase(userLetter);
		System.out.print(userLetter + vowelORconsonant(modifiedLetter));
		kb.close();

	}

	public static String vowelORconsonant(char modifiedLetter) {
		String result = "";
		switch (modifiedLetter) {
		case 'a':
			result = " is a Vowel.";
			break;
		case 'e':
			result = " is a Vowel.";
			break;
		case 'i':
			result = " is a Vowel.";
			break;
		case 'o':
			result = " is a Vowel.";
			break;
		case 'u':
			result = " is a Vowel.";
			break;
		default:
			result = " is a consonant.";
			break;
		}
		return result;
	}

}
