package viope_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValidatePrice {

	public static void main(String[] args) {

		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Enter the price before VAT: ");
			double price = Double.parseDouble(input.nextLine().replace(',', '.'));
			double finalPrice = price + price * 0.25;
			System.out.println("\n" + "The VAT inclusive price is " + twoDecimals.format(finalPrice));

		} catch (NumberFormatException nfe) {
			System.out.println("\n" + "Invalid price!");
		}

		input.close();
	}

}
