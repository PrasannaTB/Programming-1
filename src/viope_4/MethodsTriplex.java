package viope_4;

import java.util.Scanner;

public class MethodsTriplex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int integer = Integer.parseInt(input.nextLine());

		for (int i = 1; i <= integer; i++) {
			System.out.println("triplex(" + i + ") = " + triplex(i));
		}

		input.close();
	}

	private static Integer triplex(int integer) {
		int triplex = integer;
		for (int i = 0; i < integer; i++) {
			if ((i - 1) % 3 == 0) {
				triplex = triplex * i;
			}
		}
		return triplex;

	}

}
