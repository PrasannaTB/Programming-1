package viope_9;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjectsTranslatorArrayList {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<WordPair> pairList = new ArrayList<WordPair>();

		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");

		while (true) {

			System.out.print("Enter an English word: ");
			String englishWord = input.nextLine();

			if (englishWord.equals("ok")) {
				break;
			}

			System.out.print("Enter a Finnish word: ");
			String finnishWord = input.nextLine();

			System.out.println("");

			WordPair list1 = new WordPair(englishWord, finnishWord);
			pairList.add(list1);

		}
		
		System.out.println("");
		System.out.println("=== English-Finnish translation service (quit ends) ===");

		while (true) {
			boolean found = false;
			System.out.print("Enter an English word: ");
			String english = input.nextLine();

			for (WordPair p : pairList) {
				if (english.equals(p.getEnglishWord())) {
					System.out.println(p.getFinnishWord());
					found = true;
					break;
				}
			}

			if (english.equals("quit")) {
				System.out.println("Bye!");
				break;
			} else if (found == false) {
				System.out.println("Unknown word");
			}

			System.out.println("");

		}
		input.close();
		
		/* System.out.println("=== English-Finnish translation service (quit ends) ===");

		String english = "";

		System.out.print("Enter an English word: ");
		english = input.nextLine();

		while (!english.equals("quit")) {
			boolean found = false;

			for (int i = 0; i < pairList.size(); i++) {
				if (pairList.get(i).getEnglishWord().equals(english)) {
					System.out.println(pairList.get(i).getFinnishWord());
					found = true;
					break;
				}
			}
			if (found == false) {
				System.out.println("Unknown word");
			}
			System.out.println();
			System.out.print("Enter an English word: ");
			english = input.nextLine();
			
		}
		input.close();
		System.out.println("Bye!");
		*/
	}

}

class WordPair {
	private String englishWord;
	private String finnishWord;

	public WordPair(String englishWord, String finnishWord) {
		this.englishWord = englishWord;
		this.finnishWord = finnishWord;
	}

	public String getEnglishWord() {
		return englishWord;
	}

	public String getFinnishWord() {
		return finnishWord;
	}

}
