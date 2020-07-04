package creational.factorymethod;

public class WindowButton implements Button {

	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.println("Window Button renders... ");
	}

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		System.out.println("Window Button handles click...");

	}

}
