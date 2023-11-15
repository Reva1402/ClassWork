package Activity.One;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); // Scanner class to take the user input
		System.out.print("Please enter the actual price of the product: ");// asking for user input
		final double actualCost = kb.nextDouble();
		System.out.print("Please enter the sale price of the product: ");
		double salePrice = kb.nextDouble();
		double discountRate = (salePrice/actualCost)*100;
		System.out.println("Discounted rate of the product sold is: "+discountRate+" % ");
		kb.close();

	} 

}
