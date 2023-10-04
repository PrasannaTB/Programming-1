package viope_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PositiveNumbers {

	public static void main(String[] args) {

		DecimalFormat oneDecimals = new DecimalFormat("0.0");
		Scanner input = new Scanner(System.in);

		int count = 0;
		double sum = 0;

		System.out.print("Enter first integer: ");
		int a = Integer.parseInt(input.nextLine());
		if (a > 0) {
			sum += a;
			count++;
		}

		if (a == 0) {
			System.out.println("No positive values");
		} else {

			while (a != 0) {

				System.out.print("Enter next integer: ");
				a = Integer.parseInt(input.nextLine());

				if (a > 0) {
					sum += a;
					count++;
				}

			}
			System.out.println("The average of the positive values is " + oneDecimals.format(sum / count));
		}

		input.close();
	}
}
