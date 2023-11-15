package Activity.One;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter the number: ");// asking for user input
		int num1 = kb.nextInt();
		int num2 = kb.nextInt();
		int num3 = kb.nextInt();
		System.out.println("The entered numbers are " + num1 + " ," + num2 + " and " + num3);
		System.out.println("The largest number among given numbers is: " + largestNumber(num1, num2, num3));
		kb.close();
	}

	public static int largestNumber(int num1, int num2, int num3) {
		int k = 0;
		if (num1 > num2 && num1 > num3) {
			k = num1;
		} else if (num2 > num1 && num2 > num3) {
			k = num2;
		} else {
			k = num3;
		}
		return k;
	}

}
