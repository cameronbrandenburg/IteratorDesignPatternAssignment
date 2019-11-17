package csce247.assignments.iterator;

/**
 * An album that holds the information of songs
 * @author Cameron Brandenburg
 */
public class Album {

	// The maximum number of songs according to the assignment
	static final int MAX_SONGS = 20;
	
	private Song[] songs; 
	private int count;
	private String name;
	
	/**
	 * Parameterized constructor for Album
	 * @param name The name of the entire album
	 */
	public Album(String name) {
		songs = new Song[MAX_SONGS];
		this.name = name;
	}
	
	/**
	 * Adds a new song to the ArrayList of songs
	 * @param name The name of the song
	 * @param artist The name of the artist of the song
	 * @param length The length of the song
	 * @param genre The genre of the song
	 */
	public void addSong(String name, String artist, double length, String genre) {
		if (count < MAX_SONGS) {
			Song song = new Song(name, artist, length, genre);
			songs[count] = song;
			++count;
		}
	}
	
	/**
	 * Creates an instance of AlbumIterator using the array of songs
	 * @return The newly created instance of AlbumIterator
	 */
	public AlbumIterator createIterator() {
		return new AlbumIterator(songs);
	}
}
