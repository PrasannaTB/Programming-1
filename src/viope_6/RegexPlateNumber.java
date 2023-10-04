package viope_6;

import java.util.Scanner;

public class RegexPlateNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter plate number: ");
		String plateNo = input.nextLine();

		if (plateNo.matches("[A-Z]{3}(-)[0-9]{3}") == true) {
			System.out.println("Ok");
		} else {
			System.out.println("Invalid plate number");
		}

		input.close();

	}

}
