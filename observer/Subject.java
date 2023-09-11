package observer;

public interface Subject {

	/**
	 * Adds a given observer to an array list for a specific golfer
	 * @param observer An object of type Observer to be added to a golfer
	 */
	public void registerObserver(Observer observer);

	/**
	 * removes a given observer from an array list for a specific golfer
	 * @param observer An object of type Observer to be removed from a golfer
	 */
	public void removeObserver(Observer observer);

	/**
	 * Adds new data to each observer associated with a golfer
	 * @param strokes the number of strokes that a player took on a hole
	 * @param par the par for a specific hole
	 */
	public void notifyObservers(int strokes, int par);
}