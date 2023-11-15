package Activity.One;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter 3 numbers: ");// asking for user input
		int num1 = kb.nextInt();
		int num2 = kb.nextInt();
		int num3 = kb.nextInt();
		System.out.print("The largest of given 3 numbers " + num1 + " , " + num2 + " and " + num3 + " is:  "
				+ largNumof3inputs(num1, num2, num3));
		kb.close();

	}

	public static int largNumof3inputs(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num3 && num2 > num1) {
			return num2;
		} else {
			return num3;
		}
	}

}
