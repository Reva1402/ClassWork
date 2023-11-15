package Activity.One;

import java.util.Scanner;

public class Question86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter a number of inputs to know the sum: ");// asking for user input
		int noOfInputs = kb.nextInt();
		System.out.print("The Sum of given numbers is: ");
		sumOfSeries(noOfInputs);
		System.out.println();
		System.out.print("Please enter a number of inputs to know the sum: ");
		int input2 = kb.nextInt();
		System.out.print("The Sum of given numbers is: ");
		sumOfSeries(input2);;
		kb.close();
	}

	public static void sumOfSeries(int noOfInputs) {
		if (noOfInputs < 1) {
			System.out.println("Not a valid input.");
		} else {
			int i;
			for (i = 1; i <= noOfInputs; ++i) {
				System.out.print(i);
			}
		}
		System.out.println();
		int p = 1;
		int c;
				for ( c = p; c<=noOfInputs;c++){
					System.out.print(p+"+");
					p=p*10;
					p=p+1;
				}
	}
}
