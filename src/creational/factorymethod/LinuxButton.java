package creational.factorymethod;

public class LinuxButton implements Button {

	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.println("Linux Button renders...");
	}

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		System.out.println("Linux Button handles click...");
	}

}
