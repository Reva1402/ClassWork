package Activity.One;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter the number: ");// asking for user input
		double userNum = kb.nextDouble();
		if (userNum == 0) {
			System.out.println("Zero");
		} else if (userNum < 0) {
			System.out.println("Negative Number");
		} else {
			System.out.println("Positive Number");
		}

		kb.close();
	}

}
