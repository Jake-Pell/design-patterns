package observer;
import java.util.ArrayList;

public class Golfer implements Subject {

	private ArrayList<Observer> observers;
	private String name;

	/**
	 * Creates a new golfer given a name and initializes a new array list of observers
	 * for that golfer
	 * @param name A string of the golfer's name
	 */
	public Golfer(String name) {
		this.name = name;
		observers = new ArrayList<Observer>();
	}

	/**
	 * Adds a given observer to an array list for a specific golfer
	 * @param observer An object of type Observer to be added to a golfer
	 */
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	/**
	 * removes a given observer from an array list for a specific golfer
	 * @param observer An object of type Observer to be removed from a golfer
	 */
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	/**
	 * Adds new data to each observer associated with a golfer
	 * @param strokes the number of strokes that a player took on a hole
	 * @param par the par for a specific hole
	 */
	public void notifyObservers(int strokes, int par) {
		for (Observer o : observers) {
			o.update(strokes, par);
		}
	}

	/**
	 * Adds a new score to a golfer's data
	 * @param strokes the number of strokes that a player took on a hole
	 * @param par the par for a specific hole
	 */
	public void enterScore(int strokes, int par) {
		notifyObservers(strokes, par);
	}

	/**
	 * @return A string representing the golfer's name
	 */
	public String getName() {
		return this.name;
	}
}