package viope_3;

import java.util.Scanner;

public class PrintNumbers_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the middle number: ");
		int num = Integer.parseInt(input.nextLine());

		String result1 = "";
		for (int i = 1; i < num; i++) {
			result1 += i + " ";

		}

		String result2 = "";
		for (int i = num; i >= 1; i--) {
			result2 += i + " ";

		}

		String result = result1 + result2;
		System.out.print(result);

		input.close();
	}

}
