package creational.builder;

public interface Builder {

	// can be perceived as a mold for particular product: car or carmanual in this
	// instance

	public void setType(Type type);

	public void buildSeat(int numSeat);

	public void buildEngine(Engine engine);

	public void buildGPSNavigator(GPSNavigator gps);

	public void buildTransmission(Transmission transmission);

	public void buildTripComputer(TripComputer tripComputer);

}
