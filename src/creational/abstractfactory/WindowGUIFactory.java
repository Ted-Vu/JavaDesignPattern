package creational.abstractfactory;

public class WindowGUIFactory extends AbstractFactory {

	@Override
	public Button createButton() {
		return new WindowButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowCheckbox();
	}

}
