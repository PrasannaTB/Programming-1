package viope_6;

import java.util.Scanner;

public class StringPasswordStrength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter username: ");
		String username = input.nextLine();

		System.out.print("Enter password: ");
		String password = input.nextLine();

		checkStrength(username, password);

		if (checkStrength(username, password) == "true") {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}
		input.close();
	}

	private static String checkStrength(String username, String password) {

		String result = "true";

		if (password.length() < 9 || password.toUpperCase().contains(username.toLowerCase())) {
			result = "false";
		}

		return result;

	}

}
