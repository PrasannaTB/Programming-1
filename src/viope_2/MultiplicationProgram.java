package viope_2;

import java.math.BigDecimal;
import java.util.Scanner;

public class MultiplicationProgram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter x: ");
		String value1 = input.nextLine().replace(',', '.');
		BigDecimal x = new BigDecimal(value1);
		
		System.out.print("Enter y: ");
		String value2 = input.nextLine().replace(',', '.');
		BigDecimal y = new BigDecimal(value2);

		

		System.out.println("\n" + x + " * " + y + " = " + x.multiply(y));

		input.close();

	}

}