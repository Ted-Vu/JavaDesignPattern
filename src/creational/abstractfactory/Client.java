package creational.abstractfactory;

public class Client {

	public void run() {
		String osName = System.getProperty("os.name");

		AbstractFactory factory = null;

		if (osName.equalsIgnoreCase("Window 10")) {
			factory = new WindowGUIFactory();
		} else if (osName.equalsIgnoreCase("Linux")) {
			factory = new LinuxGUIFactory();
		}

		Button button = factory.createButton();
		Checkbox checkbox = factory.createCheckbox();
		
		button.onClick();
		checkbox.onCheck();

	}

}
