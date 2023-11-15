package Activity.One;

import java.util.Scanner;

public class Question44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter a number: ");// asking for user input
		int userNum = kb.nextInt();
		for(int i=1; i<=userNum; i++) {
			System.out.println(i);
		}	
		kb.close();
}
}
