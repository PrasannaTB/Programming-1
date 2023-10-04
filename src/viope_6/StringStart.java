package viope_6;

import java.util.Scanner;

public class StringStart {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String line = input.nextLine();
		
		System.out.println();
		System.out.println(line.toLowerCase());
		System.out.println(line.toUpperCase());
		System.out.println(line.length() + " characters");
		
		input.close();
	}

}
