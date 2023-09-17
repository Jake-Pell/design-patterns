package decorator;
import java.util.ArrayList;

public abstract class Vehicle {

	protected ArrayList<String> lines;

	/**
	 * Creates a new vehicle 
	 * @param lines an array list of strings containing each line
	 * of the vehicle
	 */
	public Vehicle(ArrayList<String> lines) {
		this.lines = lines;
	}

	/**
	 * Creates a string representation of a vehicle
	 * @return A string containing each line of a vehicle
	 */
	public String toString() {
		String ret = "";
		for (String line : lines)
			ret += line + "\n";
		return ret;
	}
}