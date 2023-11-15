package Activity.One;

import java.util.Scanner;


public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter the age of the person: ");// asking for user input
		int age = kb.nextInt();
		System.out.print("The person is " + rightToVote(age));
		kb.close();

	}

	public static String rightToVote(int age) {
		String result = " ";
		if (age > 17) { //condition to check the given age input
			result = "elgible to vote";
		} else {
			result = "not elgible to vote";
		}
		return result;
	}

}
