package creational.abstractfactory;

public class LinuxGUIFactory extends AbstractFactory {

	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new LinuxCheckbox();
	}

}
