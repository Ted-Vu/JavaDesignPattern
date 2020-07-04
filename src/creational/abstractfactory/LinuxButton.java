package creational.abstractfactory;

public class LinuxButton implements Button {

	@Override
	public void onClick() {
		System.out.println("Linux button gets clicked...");
	}

}
