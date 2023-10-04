package viope_3;

import java.util.Scanner;

public class PrintShape {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter width: ");
		int width = Integer.parseInt(input.nextLine());

		System.out.print("Enter height: ");
		int height = Integer.parseInt(input.nextLine());

		for (int i = 1; i <= height; i++) {

			for (int j = 1; j <= width; j++) {
				System.out.print("*");

				if (j == width) {
					System.out.print("\n");
				}

			}

		}

		input.close();

	}

}
