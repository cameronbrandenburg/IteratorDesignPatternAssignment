package csce247.assignments.iterator;

/**
 * A Song that holds the information about that song
 * @author Cameron Brandenburg
 *
 */
public class Song {

	private String name;
	private String artist;
	private double length;
	private String genre;
	
	/**
	 * Parameterized constructor for Song
	 * @param name The name of the song
	 * @param artist The name of the artist
	 * @param length The length of the song
	 * @param genre The genre of the song
	 */
	public Song(String name, String artist, double length, String genre) {
		this.name = name;
		this.artist = artist;
		this.length = length;
		this.genre = genre;
	}
	
	/**
	 * Prints out the information about the song
	 */
	public void print() {
		System.out.println(name+" by "+artist+" category: "+genre+" length: "+length);
	}
}
