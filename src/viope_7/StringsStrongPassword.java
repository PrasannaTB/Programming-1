package viope_7;

import java.util.Scanner;

public class StringsStrongPassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter password: ");
		String password = input.nextLine();

		if (checkStrength(password) == true) {
			System.out.println("Ok");
		} else {
			System.out.println("Not strong enough!");
		}

		input.close();
	}

	private static boolean checkStrength(String password) {
		boolean flag = false;

		/*
		 * if (password.matches(
		 * "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])([@#$%^&+=])(#?!@$%^&*-){0,}.{8,}$")){
		 * flag = true; } else { flag = false; }
		 */

		int countCapital = 0;
		int countSmall = 0;
		int countDigit = 0;
		int countOther = 0;

		for (int i = 0; i < password.length(); i++) {
			if (Character.isUpperCase(password.charAt(i))) {
				countCapital = 1;
			}

			else if (Character.isLowerCase(password.charAt(i))) {
				countSmall = 1;
			}

			else if (Character.isDigit(password.charAt(i))) {
				countDigit = 1;
			} else {
				countOther = 1;
			}

		}

		if (countCapital + countSmall + countDigit + countOther >= 3 && password.length() >= 8) {
			flag = true;
		}

		return flag;

	}

}
