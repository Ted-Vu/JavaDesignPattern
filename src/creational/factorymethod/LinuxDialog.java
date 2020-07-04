package creational.factorymethod;

public class LinuxDialog extends Dialog {

	@Override
	public Button createButton() {
		return new LinuxButton();
	}

}
