package creational.factorymethod;

public class Client {

	public void run() {
		String osName = System.getProperty("os.name");

		Dialog dialog = null;
		
		
		if (osName.equalsIgnoreCase("Window 10")) {
			dialog = new WindowDialog();
		} else if (osName.equalsIgnoreCase("Linux")) {
			dialog = new LinuxDialog();
		}
		
		Button button = dialog.createButton();
		button.onClick();
		
		
	}
}
