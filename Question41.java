package Activity.One;

import java.util.Scanner;

public class Question41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter a number: ");// asking for user input
		int userNum = kb.nextInt();
		System.out.print(reverseDoWhile(userNum));
		kb.close();

	}

	public static int reverseDoWhile(int userNum) {
		
		int reverse = 0;
		do {
			int modulus = userNum % 10;
			reverse = reverse * 10 + modulus;
			userNum = userNum / 10;
		} while (userNum != 0);
		return reverse;

	}

}
