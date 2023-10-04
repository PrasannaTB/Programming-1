package viope_3;

import java.util.Scanner;

public class ValidateAnswer {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		try {
			System.out.print("What is 2 + 3? ");

			int answer = Integer.parseInt(input.nextLine());

			if (answer == 5) {
				System.out.println("Correct!");
			} else {
				System.out.print("Incorrect! Try again: ");
				answer = Integer.parseInt(input.nextLine());

			}
		} catch (NumberFormatException nfe) {
			System.out.print("That is not a number! Try again: ");
			int answer = Integer.parseInt(input.nextLine());
			if (answer == 5) {
				System.out.println("Correct!");
			} else {
				System.out.print("Incorrect! Try again: ");
				answer = Integer.parseInt(input.nextLine());
			}
		}

		input.close();
	}

}
