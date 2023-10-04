package viope_8;

public class ObjectsSongProgram {

	public static void main(String[] args) {

		Song s1 = new Song("Easy on me", "Adele", 2021);
		Song s2 = new Song("Shivers", "Ed Sheeran", 2021);
		Song s3 = new Song("Holy Ghost Fire", "Larkin Poe", 2020);

		System.out.println(s1.getName() + " (" + s1.getArtist() + ", " + s1.getYear() + ")");
		System.out.println(s2.getName() + " (" + s2.getArtist() + ", " + s2.getYear() + ")");
		System.out.println(s3.getName() + " (" + s3.getArtist() + ", " + s3.getYear() + ")");
	}

}

class Song {

	private String name; // instance fields
	private String artist;
	private int year;

	public Song(String name, String artist, int year) {
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
