package week1;

import java.util.Scanner;

public class PersonProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter age: ");
		String age = input.nextLine();

		System.out.print("Enter given name: ");
		String name = input.nextLine();

		System.out.print("Enter profession: ");
		String profession = input.nextLine();

		System.out.println("\n" + name + " is a " + profession + " who is " + age + " years of age.");
		input.close();
	}

}
