package viope_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ObjectsSortWordPairsLambda {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<WordPair> pairList = new ArrayList<WordPair>();

		while (true) {

			System.out.print("Enter an English word (quit ends): ");
			String englishWord = input.nextLine();

			if (englishWord.equals("quit")) {
				break;
			}

			System.out.print("Enter a Finnish word: ");
			String finnishWord = input.nextLine();

			System.out.println("");

			pairList.add(new WordPair(englishWord, finnishWord));

		}
		System.out.println("");

		Collections.sort(pairList);

		for (WordPair p : pairList) {
			System.out.println(p.getEnglishWord() + " = " + p.getFinnishWord());
		}

		System.out.println("");

		Collections.sort(pairList, (p1, p2) -> p1.getFinnishWord().compareTo(p2.getFinnishWord()));

		for (WordPair p : pairList) {
			System.out.println(p.getFinnishWord() + " = " + p.getEnglishWord());
		}

		input.close();

	}

}
