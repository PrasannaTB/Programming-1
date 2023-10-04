package viope_4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MethodsDiscount {

	public static void main(String[] args) {

		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);

		System.out.print("Enter list price: ");
		double listPrice = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter selling price: ");
		double sellingPrice = Double.parseDouble(input.nextLine().replace(',', '.'));

		double discountPercent = computePercentage(listPrice, sellingPrice);

		System.out.println("\n" + "The discount percentage is " + twoDecimals.format(discountPercent) + " %");
		input.close();
	}

	private static double computePercentage(double listPrice, double sellingPrice) {
		return (listPrice - sellingPrice) * 100 / listPrice;

	}

}
