package creational.builder;

public class Car {

	private Type type;
	private int numSeat;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;
	private double fuel=0;

	@Override
	public String toString() {
		return "Car [type=" + type + ", numSeat=" + numSeat + ", engine=" + engine + ", transmission=" + transmission
				+ ", tripComputer=" + tripComputer + ", gpsNavigator=" + gpsNavigator + ", fuel=" + fuel + "]";
	}

	public Car(Type type, int numSeat, Engine engine, Transmission transmission, TripComputer tripComputer,
			GPSNavigator gps) {
		this.type = type;
		this.numSeat = numSeat;
		this.engine = engine;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		this.gpsNavigator = gps;
	}

	public Type getType() {
		return type;
	}

	public int getNumSeat() {
		return numSeat;
	}

	public Engine getEngine() {
		return engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public TripComputer getTripComputer() {
		return tripComputer;
	}

	public GPSNavigator getGpsNavigator() {
		return gpsNavigator;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
}
