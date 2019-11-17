package csce247.assignments.iterator;

import java.util.Iterator;

/**
 * A subclass of Iterator that is used to iterate through Albums
 * @author Cameron Brandenburg
 */
public class AlbumIterator implements Iterator {

	private Song[] songs;
	private int position;
	
	/**
	 * Parameterized constructor for AlbumIterator
	 * @param songs A passed in array of songs
	 */
	public AlbumIterator(Song[] songs) {
		this.songs = songs;
		this.position = 0;
	}
	
	/**
	 * Returns a boolean value if the album has a next song
	 * @return True if there is a next song, false otherwise
	 */
	public boolean hasNext() {
		if (position >= songs.length || songs[position] == null)
			return false;
		return true;
	}
	
	/**
	 * Returns the next song in the album
	 * @return The next song
	 */
	public Song next() {
		Song song = songs[position];
		++position;
		return song;
	}
	
}
