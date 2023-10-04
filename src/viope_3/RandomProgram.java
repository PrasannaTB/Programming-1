package viope_3;

import java.util.Random;
import java.util.Scanner;

public class RandomProgram {
	static Random randomizer = new Random();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = randomizer.nextInt(100);

		System.out.print("Guess a number (0-99): ");
		int num = Integer.parseInt(input.nextLine());

		while (num != number) {

			if (num > number) {
				System.out.println("The correct number is smaller!");
				System.out.print("\n" + "Guess again: ");
				num = Integer.parseInt(input.nextLine());

			} else if (num < number) {
				System.out.println("The correct number is larger!");
				System.out.print("\n" + "Guess again: ");
				num = Integer.parseInt(input.nextLine());

			}

		}

		if (num == number) {
			System.out.println("Correct!");
		}
		input.close();

	}

}
