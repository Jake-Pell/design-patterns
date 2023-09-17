package decorator;
import java.util.ArrayList;

public class Paint extends VehicleDecorator {

	Vehicle vehicle;
	private static final String RED = "\u001B[31m";
	private static final String GREEN = "\u001B[32m";
	private static final String PURPLE = "\u001B[35m";
	private static final String BLUE ="\u001B[34m";
	private static final String YELLOW = "\u001B[33m";
	private static final String CYAN = "\u001B[36m";
	private static final String BLACK = "\u001B[0m";

	/**
	 * Creates anew instance of Paint and changes the color
	 * of a given vehic;e
	 * @param vehicle the vehicle to be painted
	 * @param color the color to paint the vehicle
	 */
	public Paint(Vehicle vehicle, String color) {
		super(vehicle.lines);
		this.vehicle = vehicle;
		paintCar(color);
	}

	/**
	 * helper method called by constructor to paint a vehicle
	 * @param color the color to paint the vehicle
	 */
	private void paintCar(String color) {
		String newLine = "";

		switch(color) {

		case "red":
			newLine = RED;
			break;

		case "green":
			newLine = GREEN;
			break;

		case "purple":
			newLine = PURPLE;
			break;

		case "blue":
			newLine = BLUE;
			break;

		case "yellow":
			newLine = YELLOW;
			break;

		case "cyan":
			newLine = CYAN;
			break;
		}

		newLine += lines.get(0);
		lines.set(0, newLine);
		int lastIndex = lines.size()-1;
		newLine = lines.get(lastIndex);
		newLine += "\u001B[0m";
		lines.set(lastIndex, newLine);
	}
}