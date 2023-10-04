package viope_5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysCities {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of city names: ");
		int num = Integer.parseInt(input.nextLine());

		String[] names = new String[num];

		for (int i = 0; i < num; i++) {
			System.out.print("Enter city name: ");
			names[i] = input.nextLine();
		}
		Arrays.sort(names);

		System.out.println("");

		
		for (int i = 0; i < names.length; i++) {

			if (i == 0 || !names[i].equals(names[i - 1])) {
				System.out.print(names[i] + " ");

			}

		}

		input.close();
	}

}
