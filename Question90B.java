package Activity.One;

import java.util.Scanner;

public class Question90B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter an input: ");// asking for user input
		int noOfInputs = kb.nextInt();
		System.out.println(pyramidNumber(noOfInputs));

		kb.close();

	}

	public static String pyramidNumber(int noOfInputs) {
		if (noOfInputs < 1) {
			System.out.println("Not a valid input.");
		} else {
			int i = 0;
			int j = 0;
			int k = noOfInputs;
			for (i = 0; i <= 0; i--) {
				for (j = i; j <= 0; j--) {
					System.out.print(j-1);
				}
				System.out.println(" ");
			}
		}
		return "";

	}



	}

