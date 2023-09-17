package decorator;
import java.util.ArrayList;

public class Rims extends VehicleDecorator {

	Vehicle vehicle;
	/**
	 * Creates a new instance of rims from rims.txt
	 * and integrates it into a vehicle
	 * @param vehicle the vehicle to be integrated with the rims
	 */
	public Rims(Vehicle vehicle) {
		super(vehicle.lines);
		this.vehicle = vehicle;
		integrateDecor(FileReader.getLines("./decorator/txt/rims.txt"));
	}

}