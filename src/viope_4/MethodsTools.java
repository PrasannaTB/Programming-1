package viope_4;

import java.util.Scanner;

class MethodsToolsProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int int1 = Integer.parseInt(input.nextLine());

		System.out.print("Enter second integer: ");
		int int2 = Integer.parseInt(input.nextLine());

		System.out.print("Enter third integer: ");
		int int3 = Integer.parseInt(input.nextLine());

		int min = MethodTools.minimum(int1, int2, int3);

		System.out.println("\n" + "The minimum value is " + min);

		input.close();

	}

}
