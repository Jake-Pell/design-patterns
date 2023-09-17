package decorator;
import java.util.ArrayList;

public abstract class VehicleDecorator extends Vehicle {
	/**
	 * Creates a new vehicle decorator
	 * @param lines an array list of strings that contains
	 * each line of a vehicle
	 */
	public VehicleDecorator(ArrayList<String> lines) {
		super(lines);
	}

	/**
	 * Combines a decor array list with the vehicle's array list
	 * @param decor an array lust of strings that contains
	 * each line of decor to add to a vehicle
	 * 
	 */
	protected void integrateDecor(ArrayList<String> decor) {
		ArrayList<String> newLines = new ArrayList<String>();
		for (int i = 0; i < decor.size(); ++i) {
			String decorLine = decor.get(i);
			String oldLine = lines.get(i);
			String newLine = "";
			for (int j = 0; j < oldLine.length(); ++j) {
				if (j < decorLine.length() && decorLine.charAt(j) != ' ') 
					newLine += decorLine.charAt(j);
				else
					newLine += oldLine.charAt(j);
			}
			newLines.add(newLine);

		}
		lines = newLines;

	}
}