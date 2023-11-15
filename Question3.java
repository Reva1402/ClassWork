package Activity.One;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.println("Please enter the 2 numbers: ");// output asking for 2 numbers from user
		double i = kb.nextDouble();
		double j = kb.nextDouble();
		System.out.println("Entered numbers are: " + i + "," + j);
		if (i > j) { // if condition to check whether the number is maximum
			System.out.println("The maximum of given 2 numbers is : " + i);

		} else {// else this number is maximum
			System.out.println("The maximum of given 2 numbers is : " + j);

		}

		kb.close();// closing the scanner class

	}

}
