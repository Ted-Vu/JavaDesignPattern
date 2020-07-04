package creational.abstractfactory;

public class WindowCheckbox implements Checkbox {

	@Override
	public void onCheck() {
		System.out.println("Checked window checkbox...");
	}

}
