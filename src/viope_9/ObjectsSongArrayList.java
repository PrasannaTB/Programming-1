package viope_9;

import java.util.ArrayList;

public class ObjectsSongArrayList {

	public static void main(String[] args) {
		ArrayList<Song> songList = new ArrayList<Song>();

		songList.add(new Song("Easy on Me", "Adele", 2021));
		songList.add(new Song("Shivers", "Ed Sheeran", 2021));
		songList.add(new Song("Holy Ghost Fire", "Larkin Poe", 2020));

		System.out.println("=== List of songs ===");

		for (Song songObject : songList) {
			System.out
					.println(songObject.getArtist() + ": " + songObject.getName() + " (" + songObject.getYear() + ")");
		}

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
