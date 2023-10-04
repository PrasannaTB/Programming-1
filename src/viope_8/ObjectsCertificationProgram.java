package viope_8;

import java.util.Scanner;

public class ObjectsCertificationProgram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Coach[] coaches = new Coach[4];

		for (int i = 0; i < 4; i++) {
			System.out.print("Enter coach name: ");
			String name = (input.nextLine());

			System.out.print("Enter " + name + "'s score: ");
			int score = Integer.parseInt(input.nextLine());

			coaches[i] = new Coach(name, score);

		}

		System.out.print("\n" + "Enter the minimum passing score: ");
		int min = Integer.parseInt(input.nextLine());

		System.out.println("\n" + "Passing scores");

		int count = 0;
		for (int i = 0; i < 4; i++) {
			if (min <= coaches[i].getScore()) {
				System.out.println(coaches[i].getName() + " (" + coaches[i].getScore() + " points)");
				count++;
			}
		}


		double passingRate = ((double)count / 4) * 100;
		System.out.println("The passing rate is " + passingRate + " %");

		input.close();
	}

}

class Coach {
	private String name;
	private int score;

	public Coach(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

}
