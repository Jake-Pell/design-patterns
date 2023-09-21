package factory;

/**
 * A type of bike with no pedals
 * @author Jake Pell
 */
public class Strider extends Bike {

	/**
	 * Creates a new strider with the following info
	 * - name : "Strider"
	 * - number of wheels: 2
	 * - no pedals
	 * - no training wheels
	 */
	public Strider() {
		name = "Strider";
		numWheels = 2;
		hasPedals = false;
		hasTrainingWheels = false;
	}
}