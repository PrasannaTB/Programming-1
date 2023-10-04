package viope_3;

import java.util.Scanner;

public class ValidateOddNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an odd number: ");
		String num = input.nextLine();

		try {
			int number = Integer.parseInt(num);

			if (number % 2 == 0) {
				System.out.println("\n" + number + " is not an odd number");
			} else {
				System.out.println("\n" + "Ok");
			}
		} catch (NumberFormatException variable) {

			System.out.println("\n" + "'" + num + "' is not an integer");
		}

		input.close();
	}

}
