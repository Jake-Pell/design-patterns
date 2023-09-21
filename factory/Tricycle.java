package factory;

/**
 * A type of bike with three wheels
 * @author Jake Pell
 */
public class Tricycle extends Bike {

	/**
	 * Creates a new tricycle with the following info
	 * - name : "Tricycle"
	 * - number of wheels: 3
	 * - has pedals
	 * - no training wheels
	 */
	public Tricycle() {
		name = "Tricylce";
		numWheels = 3;
		hasPedals = true;
		hasTrainingWheels = false;
	}
}