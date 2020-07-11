package structural.decorator;

public class EncryptionDecorator extends DataSourceDecorator {

	public EncryptionDecorator(DataSource wrappee) {
		super(wrappee);
	}

	@Override
	public void writeData(String data) {
		super.wrappee.writeData(encode(data));
	}

	@Override
	public String readData() {
		return decode(super.wrappee.readData());
	}

	private String encode(String data) {
		// doing encoding here
		return null;
	}

	private String decode(String data) {
		// doing decoding here
		return null;
	}
}
