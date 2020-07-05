package creational.builder;

public class Engine {
	private boolean start;
	private double mileage;
	private double volume;

	public Engine(double volume) {
		start = false;
		mileage = 0;
		this.volume = volume;
	}

	public void on() {
		start = true;
	}

	public void off() {
		start = false;
	}

	public boolean go(double mileage) {
		if (start) {
			this.mileage += mileage;
			return true;
		} else {
//			System.out.println("Cannot go engine not turning on yet");
			return false;
		}
	}

	public boolean isStart() {
		return start;
	}

	public double getMileage() {
		return mileage;
	}

	public double getVolume() {
		return volume;
	}

	@Override
	public String toString() {
		return "Engine [start=" + start + ", mileage=" + mileage + ", volume=" + volume + "]";
	}
}
