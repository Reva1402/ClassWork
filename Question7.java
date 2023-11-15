package Activity.One;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter the number: ");// asking for user input
		int user_Number = kb.nextInt();
		System.out.println("The given number " + user_Number + primeNumberfinder(user_Number));//printing output from calling the method
		kb.close();
	}
	public static String primeNumberfinder(int user_Number) {
		String result = " ";
			if (user_Number % 2 == 0 || user_Number % 3 == 0 || user_Number % 5 == 0) { //to check if the user 
																						//number has more than 2 multiples
				result = " is not a Prime Number";
			} else { //if it does not have more than 2 multiples, it comes under even number
				result = " is a Prime Number";
			}
		return result; //returning the result based on condition passed.
	}

}
