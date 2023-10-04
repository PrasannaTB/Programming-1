package viope_5;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysDeviation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		DecimalFormat one = new DecimalFormat("0.0");

		System.out.print("Enter the number of values: ");
		int values = Integer.parseInt(input.nextLine());

		Integer[] array = new Integer[values];

		if (values < 4) {
			System.out.println("Sorry, at least 4 values required");
		}

		else {
			for (int i = 0; i < values; i++) {

				System.out.print("Enter an integer: ");
				array[i] = Integer.parseInt(input.nextLine());
			}

			String arrayO = "";
			for (int i = 0; i < values; i++) {

				arrayO += array[i] + " ";
			}

			Arrays.sort(array);
			System.out.println();

			int min = ArraysLibrary.minimum(array);
			int max = ArraysLibrary.maximum(array);
			double median = ArraysLibrary.median(array);
			double mean = ArraysLibrary.mean(array);
			double SD = ArraysLibrary.standardDeviation(array);

			System.out.println("n = " + array.length);
			System.out.println("Min: " + (min));
			System.out.println("Max: " + (max));
			System.out.println("Mean: " + one.format(mean));
			System.out.println("Median: " + one.format(median));
			System.out.println("Sample standard deviation: " + one.format(SD));
			System.out.print("Sample data: " + arrayO);

			input.close();

		}

	}
}
