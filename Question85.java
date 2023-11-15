package Activity.One;

import java.util.Scanner;

public class Question85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter a number: ");// asking for user input
		int userNum = kb.nextInt();
		System.out.print(cubeRoot(userNum));
		kb.close();
	}

	public static String cubeRoot(int userNum) {
		String result = " ";
		int a = 1;
		int p = 1;
		int j;
		for (a = 1; a <= userNum; a++) {
			for (j = 1; j <= a; j++) {
				p = a * j;
				p = p * j;
			}
			System.out.println("Number is : " + (j - 1) + " and cube of the " + (j - 1) + " is : " + p);
		}
		return result;
	}
}
