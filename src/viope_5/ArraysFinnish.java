package viope_5;

import java.util.Scanner;

public class ArraysFinnish {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] english = { "bus", "car", "cat", "house", "moon", "sun", "thanks", "train", "teacher" };
		String[] finnish = { "bussi", "auto", "kissa", "talo", "kuu", "aurinko", "kiitos", "kouluttaa", "opettaja" };

		System.out.print("Enter an English word: ");
		String word = input.nextLine();

		String output = "";

		output = "Unknown word";
		for (int i = 0; i < english.length; i++) {

			if (word.equals(english[i])) {
				output = finnish[i];

			}
		}

		System.out.println(output);

		input.close();
	}

}
