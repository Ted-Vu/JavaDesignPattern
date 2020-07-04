package creational.factorymethod;

public abstract class Dialog {

	public void renderDialog() {
		
		Button button = createButton();
		button.render();
	}

	// Factory method to be overriden by concrete buttons: window or linux in this
	// example
	public abstract Button createButton();
}
