package Activity.One;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter the value of a: ");// asking for user input
		double a = kb.nextDouble();
		System.out.print("Please enter the value of b: ");
		double b = kb.nextDouble();
		System.out.print("Please enter the value of c: ");
		double c = kb.nextDouble();
		
		double delta = (b*b)-4*a*c;
		System.out.println("The delta value is: "+delta);
		System.out.println(quadraticEquation(delta,a,b));
		kb.close();
		

	} public static String quadraticEquation(double delta, double a, double b) {
		String result;
		if (delta>0) {
			double root1 = (-b + Math.sqrt(delta))/(2*a);
			double root2 = (-b - Math.sqrt(delta))/(2*a);
			result = "The root one is "+root1+"\n"+"The root two is "+ root2;
			
		} else if (delta == 0) {
			double roots = -b/(2*a);
			result = "the one root is"+roots;
		}else {
			result = "It does not have a root";
		} return result;
	}
}
