package viope_6;

import java.util.Scanner;

public class StringCharacters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String line = input.nextLine();

		int countLetter = 0;
		int countDigit = 0;
		

		for (int i = 0; i < line.length(); i++) {
			if (Character.isLetter(line.charAt(i))) {
				countLetter++;
			}
			if (Character.isDigit(line.charAt(i))) {
				countDigit++;
			}

		}
		System.out.println(countLetter + " letter(s)");
		System.out.println(countDigit + " digit(s)");
		System.out.println(line.length() - countLetter - countDigit + " other character(s)");
		input.close();
	}

}
