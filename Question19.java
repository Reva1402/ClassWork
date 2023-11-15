package Activity.One;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter the number: ");// asking for user input
		int userNum = kb.nextInt();
		System.out.print("The entered number "  + " is " + evenPositive(userNum));
		kb.close();

	} public static String evenPositive(int userNum) {
		if(userNum>0 && userNum%2==0) {
			return userNum+"  an even and positive number";
		}else {
			return userNum+" not an even and positive number.";
		}
	}

}
