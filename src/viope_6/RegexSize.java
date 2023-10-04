package viope_6;

import java.util.Scanner;

public class RegexSize {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter size: ");
		String size = input.nextLine().toUpperCase();

		if (size.matches("(X{0,2}[S|L]|M)")) {
			System.out.println("Size ok");
		} else {
			System.out.println("Invalid size");
		}

		input.close();

	}

}
