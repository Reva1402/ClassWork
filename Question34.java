package Activity.One;

import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an input for the multiplication table: ");
		int a = kb.nextInt();

		multiplication(a);
		kb.close();

	}

	public static String multiplication(int a) {
		int count = 1;
		while(count<=10) {
			System.out.println(a+" X "+count+" = "+a*count);
			count++;
		}

		return "";
	}

}
