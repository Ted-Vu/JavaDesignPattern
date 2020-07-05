package creational.builder;

public class TripComputer {
	
	private Car car;
	
	public TripComputer() {
		
	}
	
	public TripComputer(Car car) {
		this.car=car;
	}
	
	public String showStatus() {
		if(car.getEngine().isStart()) {
			return "The car has been started";
		}else {
			return "The car has not been started";
		}
	}
	
	public double getFuel() {
		return car.getFuel();
	}
	
	
}
