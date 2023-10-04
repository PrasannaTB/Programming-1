package viope_3;

import java.util.Scanner;

public class PrintNumbers_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the middle number: ");
		int num = Integer.parseInt(input.nextLine());

		int count = 0;
		String result1 = "";
		for (int i = 1; i < num; i++) {
			result1 += i + " ";
			count++;
		}

		String result2 = "";
		for (int i = num; i >= 1; i--) {
			result2 += i + " ";
			count++;
		}

		String result = result1 + result2;
		System.out.print(result);

		if (count == 1) {
			System.out.println("\n" + count + " number printed");
		} else if (count == 0) {
			System.out.println(count + " numbers printed");
		} else {
			System.out.println("\n" + count + " numbers printed");
		}

		input.close();

	}

}
