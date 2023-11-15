package Activity.One;

import java.util.Scanner;

public class Question38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter a number: ");// asking for user input
		int userNum = kb.nextInt();
		System.out.print(sumOfNaturalNumbers(userNum));
		kb.close();

	}

	public static int sumOfNaturalNumbers(int userNum) {
		int count = 1;
		int sum = 0;
		do {
			sum = sum+count;
			count++;
			
		} while (count <= userNum);

		return sum;

	}

}
