package Activity.One;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter a number: ");// asking for user input
		int userNum = kb.nextInt();
		System.out.print(reverseNum(userNum));
		kb.close();
	}

	public static int reverseNum(int userNum) {
		int reverse = 0;
		while (userNum != 0) {
			int modulus = userNum % 10;
			reverse = reverse * 10 + modulus;
			userNum = userNum / 10;
		}
		return reverse;

	}

}
