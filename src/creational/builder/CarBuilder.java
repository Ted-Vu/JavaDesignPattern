package creational.builder;

public class CarBuilder implements Builder {

	private Type type;
	private int numSeat;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;

	@Override
	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public void buildSeat(int numSeat) {
		this.numSeat = numSeat;
	}

	@Override
	public void buildEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void buildGPSNavigator(GPSNavigator gps) {
		this.gpsNavigator = gps;
	}

	@Override
	public void buildTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	@Override
	public void buildTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}

	public Car getResult() {
		return new Car(type, numSeat, engine, transmission, tripComputer, gpsNavigator);
	}

}
