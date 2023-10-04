package viope_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BeachVolleyball {

	public static void main(String[] args) {

		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of people: ");
		int people = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter the hourly rate: ");
		double hourlyRate = Double.parseDouble(input.nextLine().replace(',','.'));
		
		System.out.print("Enter the length of the rental (hours): ");
		double length = Double.parseDouble(input.nextLine().replace(',','.'));
		
		System.out.println("\n" + "Each of the " + people + " people should pay " + twoDecimals.format(length * hourlyRate / people) + " euros.");
		
		input.close();
	}

}
