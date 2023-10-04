package viope_5;

import java.util.Scanner;

public class ArraysCandidates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of candidates: ");
		int candidates = Integer.parseInt(input.nextLine());

		String[] names = new String[candidates];
		Integer[] votes = new Integer[candidates];

		for (int i = 0; i < candidates; i++) {

			System.out.print("Enter name: ");
			names[i] = input.nextLine();

			System.out.print("Enter " + names[i] + "'s votes: ");
			votes[i] = Integer.parseInt(input.nextLine());

		}
		int max = 0;
		String winner = "";
		String listTie = "";
		boolean tie = false;

		for (int i = 0; i < votes.length; i++) {
			if (votes[i] > max) {
				max = votes[i];
				winner = names[i];
				listTie = "\n" + names[i] + " (" + votes[i] + " votes)";
				tie = false;
			} else if (votes[i] == max) {
				listTie += "\n" + names[i] + " (" + votes[i] + " votes)";
				tie = true;
			}
		}

		if (tie) {
			System.out.println("It is a tie!" + listTie);
		} else {
			System.out.println("\n" + winner + " is the winner with " + max + " votes!");
		}

		input.close();

	}

}
