package viope_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArraysLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.0");

		String[] grade = { "A", "A", "B", "A", "C", "B", "C", "F", "B", "B", "B", "A", "C", "C", "C" };

		System.out.print("Enter letter: ");
		String letter = input.nextLine();

		double count = 0;
		double output = 0;

		for (int i = 0; i < grade.length; i++) {
			if (letter.equals(grade[i])) {
				count++;

			}

		}
		output = count / grade.length * 100;

		/*
		 * 
		 * System.out.println(grade.length); System.out.println(count + grade.length);
		 */

		System.out.println(oneDecimal.format(output) + " %");

		input.close();
	}

}
