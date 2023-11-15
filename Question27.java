package Activity.One;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter a number: ");// asking for user input
		int monthNum = kb.nextInt();
		System.out.print(noOfDays(monthNum));
		kb.close();
	}

	public static String noOfDays(int monthNum) {
		String result;
		switch (monthNum) {
		case 1:
			result = "January has 31 days.";
			break;
		case 2:
			result = "February has 28 days.";
			break;
		case 3:
			result = "March has 31 days.";
			break;
		case 4:
			result = "April has 30 days.";
			break;
		case 5:
			result = "May has 31 days.";
			break;
		case 6:
			result = "June has 30 days.";
			break;
		case 7:
			result = "July has 31 days.";
			break;
		case 8:
			result = "August has 31 days.";
			break;
		case 9:
			result = "September has 31 days.";
			break;
		case 10:
			result = "October has 31 days.";
			break;
		case 11:
			result = "November has 30 days.";
			break;
		case 12:
			result = "December has 31 days.";
			break;
		default:
			result = "Not a valid input.";

		}
		return result;
	}

}
