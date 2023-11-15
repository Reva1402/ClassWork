package Activity.One;

import java.util.Scanner;

public class Question39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int a = kb.nextInt();
		System.out.println(factorial(a));
		factorial(a);
		kb.close();

	}

	public static int factorial(int a) {

		int fact = 1;
		int count = 1;
		do {
			fact = fact * count;
			count++;
		} while (count <= a);

		return fact;

	}

}
