package viope_2;



import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainTravel {

	public static void main(String[] args) {

		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of train trips: ");
		double trips = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter the single ticket price: ");
		double single = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter the monthly season ticket price: ");
		double monthly = Double.parseDouble(input.nextLine().replace(',', '.'));

		if (trips * single < monthly) {
			System.out.println("\n" + "Buying single tickets is " + twoDecimals.format(monthly - trips * single)
					+ " euros cheaper.");

		} else if (trips * single > monthly) {
			System.out.println("\n" + "Buying a monthly season ticket is " + twoDecimals.format(trips * single - monthly)
					+ " euros cheaper.");

		} else {
			System.out.println("\n" + "The total cost is the same.");

		}

		input.close();
	}

}
