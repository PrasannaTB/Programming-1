package viope_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FixedTerm {

	public static void main(String[] args) {

		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);

		System.out.print("Enter initial deposit: ");
		Double deposit = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter time period in full years: ");
		int year = Integer.parseInt(input.nextLine().replace(',', '.'));

		System.out.print("Enter interest rate (%): ");
		double interestRate = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter capital income tax rate (%): ");
		double incomeTax = Double.parseDouble(input.nextLine().replace(',', '.'));

		double interest = 0;
		double balance = deposit;

		for (int i = 1; i <= year; i++) {

			interest = interestRate / 100 * balance + interest;
			balance = interest + deposit;

			System.out.println("Year " + i + ": " + twoDecimals.format(interest) + " | " + twoDecimals.format(balance));
		}

		double interestAfterTax = interest - (incomeTax / 100 * interest);
		System.out.println("\n" + "The interest after tax is " + twoDecimals.format(interestAfterTax));

		double lastBalance = deposit + interestAfterTax;
		System.out.println("The remaining balance after tax is " + twoDecimals.format(lastBalance));

		input.close();

	}

}
