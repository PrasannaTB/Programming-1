package week1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimalProgram {

	public static void main(String[] args) {
		
		DecimalFormat two = new DecimalFormat("0.00");
		DecimalFormat six = new DecimalFormat("0.000000");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal number: ");
		double number1  = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		
		System.out.print("Enter a decimal number: ");
		double number2  = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.println('\n' + two.format(number1) + " * " + two.format(number2) + " = " +  two.format(number1 * number2));
		System.out.println(two.format(number1) + " * " + two.format(number2) + " = " +  six.format(number1 * number2));

		input.close();
	}

}
