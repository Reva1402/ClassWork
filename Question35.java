package Activity.One;

import java.util.Scanner;

public class Question35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the base number: ");
		int basenumber = kb.nextInt();
		System.out.println("Please enter the power of the base number: ");
		int exponent = kb.nextInt();
		int expvalue = exponent;
		long power = 1;

		while (exponent != 0) {
			power = power* basenumber;
			--exponent;

		}
		System.out.println("The value of " + basenumber + " to the power of " + expvalue + " is " + power);

		kb.close();

	}

}
