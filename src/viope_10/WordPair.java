package viope_10;

class WordPair implements Comparable<WordPair> {

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

	public int compareTo(WordPair other) {
		return this.englishWord.compareTo(other.englishWord);
	}

}
