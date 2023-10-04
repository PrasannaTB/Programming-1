package viope_7;

import java.util.Scanner;

public class StringsDecimalPart {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		String decimalString = input.nextLine().replace('.', ',');

		if (isValidDecimal(decimalString)) {
			int decimalIndex = decimalString.indexOf('.');
			decimalIndex = decimalString.indexOf(',');
			int decimalPartLength = decimalString.substring(decimalIndex + 1).length();
			System.out.println(decimalPartLength + " decimal place(s)");
		} else {
			System.out.println("Please enter a proper decimal number.");
		}
		input.close();
	}

	private static boolean isValidDecimal(String decimalString) {
		// A proper decimal number must contain at least one digit in the integer part,
		// a comma or dot as the decimal separator, and at least one digit in the
		// fractional part.
		return decimalString.matches("\\d+[,.]\\d+");
	}
}
