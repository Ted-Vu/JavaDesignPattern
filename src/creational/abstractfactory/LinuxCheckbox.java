package creational.abstractfactory;

public class LinuxCheckbox implements Checkbox {
	@Override
	public void onCheck() {
		System.out.println("Checked linux checkbox...");
	}

}
