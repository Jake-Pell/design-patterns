package decorator;
import java.util.ArrayList;

public class Smile extends VehicleDecorator {

	Vehicle vehicle;
	/**
	 * Creates a new instance of smile from smile.txt
	 * and integrates it into a vehicle
	 * @param vehicle the vehicle to be integrated with the smile
	 */
	public Smile(Vehicle vehicle) {
		super(vehicle.lines);
		this.vehicle = vehicle;
		integrateDecor(FileReader.getLines("./decorator/txt/smile.txt"));
	}
}