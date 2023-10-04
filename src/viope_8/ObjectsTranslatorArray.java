package viope_8;

import java.util.Scanner;

public class ObjectsTranslatorArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		WordPair[] pairArray = {

				new WordPair("bird", "lintu"), new WordPair("bar", "baari"), new WordPair("bus", "bussi"),
				new WordPair("car", "auto"), new WordPair("cat", "kissa"), new WordPair("dog", "koira") };

		System.out.print("Enter an English word: ");
		String english = input.nextLine();

		boolean found = false;
		String finnish = "";

		for (WordPair p : pairArray) {

			if (p.getEnglishWord().equals(english)) {
				
				found = true;
				finnish = p.getFinnishWord();

			}
		}
		
		if(found == true) {
			System.out.println(finnish);
		} else {
			System.out.println("Unknown word");
		}

		input.close();
	}

}

