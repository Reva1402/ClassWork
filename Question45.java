package Activity.One;

import java.util.Scanner;

public class Question45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter a number: ");// asking for user input
		int userNum = kb.nextInt();
		int k = 1;
		for(int i=1; i<=userNum; i++) {
			k=k*i;
		}	System.out.println(k);
		kb.close();

	}

}
