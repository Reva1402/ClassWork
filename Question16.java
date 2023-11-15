package Activity.One;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter an input: ");// asking for user input
		int num1 = kb.nextInt();
		System.out.println(num1+perfectSquare(num1));
		kb.close();

	}

	public static String perfectSquare(int num1) {
		String result;
		int sqrnum = (int) Math.sqrt(num1);
		if (sqrnum * sqrnum == num1) {
			result = " is a perfect square number.";
		} else {
			result = " is not a perfect square number.";
		}
		return result;
	}

}
