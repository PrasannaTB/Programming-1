package viope_4;

import java.util.Scanner;

public class MethodsMinimum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int int1 = Integer.parseInt(input.nextLine());

		System.out.print("Enter second integer: ");
		int int2 = Integer.parseInt(input.nextLine());

		System.out.print("Enter third integer: ");
		int int3 = Integer.parseInt(input.nextLine());

		// int minimum = minimum(int1, int2, int3);
		int min = minimum(int1, int2, int3);

		System.out.println("\n" + "The minimum value is " + min);

		input.close();
	}

	private static Integer minimum(int int1, int int2, int int3) {
		int min;
		// return Math.min(int1, Math.min(int2, int3));
		if (int1 < int2 && int1 < int3) {
			min = int1;
		} else if (int1 > int2 && int2 < int3) {
			min = int2;
		} else {
			min = int3;
		}
		return min;
	}

}
