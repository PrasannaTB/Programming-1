package viope_8;

public class ObjectsWordPairsProgram {

	public static void main(String[] args) {
		WordPair pair1 = new WordPair("school", "koulu");
		WordPair pair2 = new WordPair("student", "opiskelija");
		WordPair pair3 = new WordPair("textbook", "oppikirja");

		System.out.println(pair1.getEnglishWord() + " = " + pair1.getFinnishWord());
		System.out.println(pair2.getEnglishWord() + " = " + pair2.getFinnishWord());
		System.out.println(pair3.getEnglishWord() + " = " + pair3.getFinnishWord());

	}

}
