package creational.abstractfactory;

public class WindowButton implements Button {

	@Override
	public void onClick() {
		System.out.println("Window button gets clicked...");
	}

}
