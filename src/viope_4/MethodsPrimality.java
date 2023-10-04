package viope_4;

import java.util.Scanner;

public class MethodsPrimality {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int integer = Integer.parseInt(input.nextLine());

		isPrime(integer);

		boolean isNotPrime = false;

		for (int i = 1; i < integer; i++) {

			if (isPrime(i) == false) {
				isNotPrime = true;
				System.out.print(i + " ");
			}

		}

		if (isNotPrime == false) {
			System.out.println("Nothing to be printed");
		}

		input.close();
	}

	private static boolean isPrime(int integer) {
		boolean flag = true;

		if (integer <= 1) {
			flag = false;

		} else {

			for (int i = 2; i <= integer / 2; i++) {
				if (integer % i == 0) {
					flag = false;
				}
			}

		}
		return flag;
	}

}
