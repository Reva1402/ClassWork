package Activity.One;

import java.util.Scanner;

public class Question88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter a grade: ");// asking for user input
		char grade = kb.next().charAt(0);
		char modigrade = Character.toUpperCase(grade);
		System.out.println("You have chosen: "+gradeDescription(modigrade));

		kb.close();

	}

	public static String gradeDescription(char modigrade) {
		String result = " ";

		switch (modigrade) {
		case 'E':
			result = " Excellent ";
			break;
		case 'V':
			result = " Very Good ";
			break;
		case 'G':
			result = " Good ";
			break;
		case 'A':
			result = " Average ";
			break;
		case 'F':
			result = " Fail ";
			break;
		default:
			result = " Not a valid input";
		}

		return result;
	}

}
