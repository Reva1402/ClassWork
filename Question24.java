package Activity.One;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter a number: ");// asking for user input
		int num1 = kb.nextInt();
		if (num1 < 2) {
			System.out.println("Not a valid input");
			System.exit(0);
		
		} 
		if (num1 % 2 != 0 && num1 % 3 != 0 && num1 % 5 != 0) {
			System.out.println("prime number.");
		}
		if (num1 % 2 == 0) {
			System.out.println("even number.");
		} else {
			System.out.println("odd number.");
		}

//		System.out.print("The entered number " + num1 + " is a " + evenoOddOrPrime(num1));
		kb.close();
	}

//	public static String evenoOddOrPrime(int num1) {
//		if (num1 % 2 != 0 && num1 % 3 != 0 && num1 % 5 != 0) {
//			return "prime number.";
//		}
//		if (num1 % 2 == 0) {
//			return "even number.";
//		} else {
//			return "odd number";
//		}
//	}

}
