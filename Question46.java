package Activity.One;

import java.util.Scanner;

public class Question46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter a number: ");// asking for user input
		int userNum = kb.nextInt();
		int j = 1;
		for (int i = 1; i <= 10; i++) {
			for(int l = 1; l<=userNum; l++) {
				j=i*l;
			}System.out.println(userNum+" X "+i+" = "+j);
		}System.out.println();
		
		kb.close();

	}

}
