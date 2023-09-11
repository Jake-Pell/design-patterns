package observer;

public interface Observer {
	/**
	 * Update an observer with new values for strokes and par
	 * @param strokes the number of strokes that a player took on a hole
	 * @param par the par for a specific hole
	 */
	public void update(int strokes, int par);

	/**
	 * Creates a string representation of the data held in an observer
	 * @return A string containing the values held in an observer
	 */
	public String toString();
}