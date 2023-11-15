package Activity.One;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.println("Please enter the 2 numbers to swap: ");// asking for user input
		int num1 = kb.nextInt();
		int num2 = kb.nextInt();
		System.out.println("Numbers before swapping are number 1 is: "+num1+" number 2 is "+num2);
		int num3 = 0;
		num3=num1;
		num1=num2;
		num2=num3;
		System.out.println("Numbers after swapping are number 1 is: "+num1+" number 2 is "+num2);
		kb.close();
		
		
//		int a = 1;
//		int b = 2;
//		
//		a = a+b;
//		b = a-b;
//		a = a-b;
//		System.out.println("Swapped numbers are: "+a+" , "+b);
	}
}
