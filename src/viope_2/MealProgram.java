package viope_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MealProgram {

	public static void main(String[] args) {
		
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the price of food: ");
		double price = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.print("Enter the tax rate: ");
		double tax = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.print("Enter the tip percentage: ");
		double tip = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		double finalPrice = price + tax / 100 * price + tip / 100 * price;
		
		System.out.println('\n' + "The total cost is " + twoDecimals.format(finalPrice));
		
		input.close();
		

	}

}
