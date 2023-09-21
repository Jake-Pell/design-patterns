package factory;

/**
 * A store to create different types of bikes
 * @author Jake Pell
 */
public class BikeStore {

	/**
	 * Creates and returns a bike of the given type
	 * @param type The type of bike to be made (tricycle, strider, kids bike)
	 * @return A new Bike object based n the provided type
	 */
	public Bike createBike(String type) {
		switch(type) {

		case "tricycle":
			return new Tricycle();

		case "strider":
			return new Strider();

		case "kids bike":
			return new KidsBike();
		}
		return null;
	}

}