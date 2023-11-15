package Activity.One;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter 4 numbers: ");// asking for user input
		int num1 = kb.nextInt();
		int num2 = kb.nextInt();
		int num3 = kb.nextInt();
		int num4 = kb.nextInt();
		System.out.print("The largest of given 4 numbers " + num1 + " , " + num2 + " , " + num3 + " and " + num4
				+ " is:  " + largNumof4inputs(num1, num2, num3, num4));
		kb.close();

	}

	public static String largNumof4inputs(int num1, int num2, int num3, int num4) {
		int max = Math.max(num1, num2);
		int max2 = Math.max(max, num3);
		int max3 = Math.max(max2, num4);
		return max3 + " is the largest among given numbers.";
	}
}
