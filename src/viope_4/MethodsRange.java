package viope_4;

import java.util.Scanner;

public class MethodsRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first value: ");
		int first = Integer.parseInt(input.nextLine());

		System.out.print("Enter last value: ");
		int last = Integer.parseInt(input.nextLine());
		printRange(first, last);

		input.close();

	}

	private static void printRange(int first, int last) {
		System.out.println();
		for (int i = first; i <= last; i++) {
			System.out.print(i + " ");
		}

	}

}
