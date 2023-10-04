package viope_8;

public class ObjectsSongArray {

	public static void main(String[] args) {
		Songs[] songArray = {

				new Songs("Easy on me", "Adele", 2021), 
				new Songs("Shivers", "Ed Sheeran", 2021),
				new Songs("Holy Ghost Fire", "Larkin Poe", 2020) };

		System.out.println("=== List of songs ===");

		for (int i = 0; i < songArray.length; i++) {
			System.out.println(
					songArray[i].getArtist() + ": " + songArray[i].getName() + " (" + songArray[i].getYear() + ")");

		}

	}

}

class Songs {

	private String name; // instance fields
	private String artist;
	private int year;

	public Songs(String name, String artist, int year) {
		this.name = name;
		this.artist = artist;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public String getArtist() {
		return artist;
	}

	public int getYear() {
		return year;
	}

	public String toString() {
		return name + "(" + artist + ", " + year + ")";
	}

}
