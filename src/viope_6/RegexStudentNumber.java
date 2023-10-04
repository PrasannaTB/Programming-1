package viope_6;

import java.util.Scanner;

public class RegexStudentNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter student number: ");
		String studentNo = (input.nextLine());

		if (studentNo.matches("2[0-9]{7}") == true) {
			System.out.println("Ok");
		} else {
			System.out.println("Invalid student number");
		}

		input.close();
	}

}
