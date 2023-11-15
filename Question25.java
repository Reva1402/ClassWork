package Activity.One;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter a number: ");// asking for user input
		int monthNum = kb.nextInt();
		System.out.print( monthNum + ", is " + monthName(monthNum));
		kb.close();

	}   public static String monthName(int monthNum) {
		String monthName = " ";
		switch(monthNum) {
		case 1:
			monthName="January";
			break;
		case 2:
			monthName="February";
			break;
		case 3:
			monthName="March";
			break;
		case 4:
			monthName="April";
			break;
		case 5:
			monthName="May";
			break;
		case 6:
			monthName="June";
			break;
		case 7:
			monthName="July";
			break;
		case 8:
			monthName="August";
			break;
		case 9:
			monthName="September";
			break;
		case 10:
			monthName="October";
			break;
		case 11:
			monthName="November";
			break;
		case 12:
			monthName="December";
			break;
		default:
			monthName = "not a valid input.";
		
		
		} return monthName;
	}
}


