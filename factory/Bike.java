package factory;

/**
 * A bike with name, wheels, pedals, andprice
 * @author Jake Pell
 */
public class Bike {

	protected String name;
	protected double price;
	protected int numWheels;
	protected boolean hasPedals;
	protected boolean hasTrainingWheels;

	/**
	 * Creates a string representation of a bike assembly
	 * - creates frame based on type
	 * - adds correct number of wheels
	 * - adds pedals if applicable
	 * @return A string containing what was added to the bike
	 */
	public String assembleBike() {
		String ret = "Creating a " + name + "\n";
		ret += createFrame();
		ret += addWheels();
		if (hasPedals)
			ret += addPedals();
		return ret;
	}

	/**
	 * Create a string representation of a bike frame being assembled
	 * @return A string stating the name of the bike being assembled
	 */
	private String createFrame() {
		return "- Assembling " + name + " frame\n";
	}

	/**
	 * Creates a string representation of the number of wheels added to a bike
	 * Adds training wheels if the bike has them
	 * @return A string stating the number of wheels added. Also states if training
	 * 			wheels were added.
	 */
	private String addWheels() {
		String ret = "- Adding " + numWheels + " wheel(s)\n";
		if (hasTrainingWheels)
			ret += "- Adding training wheels\n";
		return ret;
	}

	/**
	 * Creates a string representation of pedals being added
	 * @return A string stating that pedals were added
	 */
	private String addPedals() {
		return "- Adding pedals\n";
	}

	/**
	 * Get the price of a bike
	 * @return a double containing the bike's price
	 */
	public double getPrice() {
		return price;
	}
}