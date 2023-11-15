package Activity.One;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.println("Please enter the 3 numbers: ");// output asking for 3 numbers from user
		double i = kb.nextDouble();
		double j = kb.nextDouble();
		double k = kb.nextDouble();
		double avg = (i + j + k) / 3; // declaring the variable and initializing it to assign the average value of
									// given inputs

		System.out.println("Entered numbers are: " + i + "," + j + "," + k);
		System.out.println("The average of given 3 numbers is :" + avg);// printing out the output

		kb.close();// closing the scanner class

	}

}
