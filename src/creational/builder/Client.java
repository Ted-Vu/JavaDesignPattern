package creational.builder;

public class Client {

	public void run() {
		
		Director director = new Director();
		CarBuilder builder =new CarBuilder();
		
		director.constructCityCar(builder);
		
		Car car = builder.getResult();
		
	}
}
