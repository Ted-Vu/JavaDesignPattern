package creational.builder;

public class Director {

	public void constructSportCar(Builder builder) {

		// build the components first: engine,gpsnavigator,transmission,tripcomputer
		// calling builder method to build each component

		builder.setType(Type.SPORT_CAR);
		builder.buildEngine(new Engine(50));
		builder.buildGPSNavigator(new GPSNavigator());
		builder.buildSeat(4);
		builder.buildTransmission(Transmission.AUTOMATIC);
		builder.buildTripComputer(new TripComputer());
	}

	public void constructCityCar(Builder builder) {
		// building specific type of car here...
	}

	public void constructSUV(Builder builder) {
		// building specific type of car with related components here...
	}
}
