package viope_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PopulationProgram {

	public static void main(String[] args) {
		
		DecimalFormat oneDecimals= new DecimalFormat("0.0");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the population of the area A: ");
		double areaA = Double.parseDouble(input.nextLine());
		
		System.out.print("Enter the population of the area B: ");
		double areaB = Double.parseDouble(input.nextLine());
		
		System.out.print("Enter the population of the area C: ");
		double areaC = Double.parseDouble(input.nextLine());
		
		double percentA = areaA / (areaA + areaB + areaC) * 100;
		double percentB= areaB / (areaA + areaB + areaC) * 100;
		double percentC = areaC / (areaA + areaB + areaC) * 100;
		
		System.out.println("\n" + "A: " + oneDecimals.format(percentA) + " %");
		System.out.println("B: " + oneDecimals.format(percentB) + " %");
		System.out.println("C: " + oneDecimals.format(percentC) + " %");
		
		input.close();
		

	}

}
