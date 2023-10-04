package viope_8;

public class ObjectsWordPairsArray {

	public static void main(String[] args) {

		WordPair[] pairArray = new WordPair[3];

		pairArray[0] = new WordPair("school", "koulu");
		pairArray[1] = new WordPair("student", "opiskelija");
		pairArray[2] = new WordPair("textbook", "oppikirja");

		for (int i = 0; i < pairArray.length; i++) {
			System.out.println(pairArray[i].getEnglishWord() + " = " + pairArray[i].getFinnishWord());
		}

	}

}
