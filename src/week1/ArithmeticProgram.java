package week1;
import java.util.Scanner;

public class ArithmeticProgram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int integer1 = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter another integer: ");
		int integer2 = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter a decimal number: ");
		double decimal  = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		double product = decimal * decimal;
		
		System.out.println("\n" + integer1 + " * " + integer2 + " = " + integer1 * integer2);
		System.out.println(integer1 + " * " + decimal + " = " + integer1 * decimal);
		System.out.println(decimal + " * " + decimal + " = " + product);
		
		input.close();
		
		
	}

}
