package Activity.One;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.println("Please enter the input number: ");
		int userNumber = kb.nextInt();
		int k = userNumber;
		final int origin = 0;
		if (userNumber < origin) {
			k = -(userNumber); //if the input os negative integer, k turns the value as positive to give absolute value i.e, points from origin
		} else {
			k = userNumber;
		}
		System.out.println("The absolute value of given number is " + k);
		kb.close();
	}

}
