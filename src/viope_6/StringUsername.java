package viope_6;

import java.util.Scanner;

public class StringUsername {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter given name: ");
		String givenName = input.nextLine();

		System.out.print("Enter surname: ");
		String surname = input.nextLine();

		if (!createUsername(givenName, surname).equals("")) {
			System.out.println(createUsername(givenName, surname));
		} else {
			System.out.println("Not enough letters to create a username!");
		}

		input.close();

	}

	private static String createUsername(String givenName, String surname) {

		String username;

		if (givenName.length() >= 3 && surname.length() >= 4) {
			username = surname.substring(surname.length() - 2)
					+ givenName.substring(0, 3);
		} else {
			username = "";
		}

		return username.toLowerCase();
	}
}
