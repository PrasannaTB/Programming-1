package viope_3;

import java.util.Scanner;

public class StringBling {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String longest = "";
		int longestLength = 0;

		System.out.print("Enter first string: ");
		String string1 = input.nextLine();

		if (string1.length() > longestLength) {
			longest = string1;
			longestLength = longest.length();
		}

		if (string1.equalsIgnoreCase("stop")) {
			System.out.println("Nothing to be printed");

		} else {

			while (!string1.equals("stop")) {
				System.out.print("Enter next string: ");
				string1 = input.nextLine();

				if (string1.length() > longestLength) {
					longest = string1;
					longestLength = string1.length();

				}
			}
			System.out.println("\n" + "'" + longest + "'");

		}

		input.close();

	}

}
