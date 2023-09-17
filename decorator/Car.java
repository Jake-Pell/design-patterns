package decorator;
import java.util.ArrayList;

public class Car extends Vehicle {
	/**
	 * Creates a new car from the file car.txt
	 */
	public Car() {
		super(FileReader.getLines("./decorator/txt/car.txt"));
	}
}