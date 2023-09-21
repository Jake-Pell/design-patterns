package factory;

/**
 * A type of bike with training wheels
 * @author Jake Pell
 */
public class KidsBike extends Bike {

	/**
	 * Creates a new kids bike with the following info
	 * - name : "kids bike"
	 * - number of wheels: 2
	 * - has pedals
	 * - has training wheels
	 */
	public KidsBike() {
		name = "Kids Bike";
		numWheels = 2;
		hasPedals = true;
		hasTrainingWheels = true;
	}
}