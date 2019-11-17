package csce247.assignments.iterator;

/**
 * An interface called Iterator that AlbumIterator implements
 * @author Cameron Brandenburg
 */
public interface Iterator {

	/**
	 * Returns if a data structure has a next object
	 * @return A boolean value if the structure has a next object
	 */
	public boolean hasNext();
	
	/**
	 * Returns the next object in a data structure
	 * @return The next object
	 */
	public Object next();
}
