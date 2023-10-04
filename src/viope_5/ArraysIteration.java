package viope_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraysIteration {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Integer[] array = new Integer[5];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter an integer: ");
			array[i] = Integer.parseInt(input.nextLine());
		}

		Arrays.sort(array, Collections.reverseOrder());

		System.out.println();

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

			/*
			 * for (int integers : array) { System.out.print(integers + " ");
			 */
			input.close();
		}

	}

}
