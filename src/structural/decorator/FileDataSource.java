package structural.decorator;

public class FileDataSource implements DataSource {

	private String name;

	public FileDataSource(String name) {
		this.name = name;
	}

	@Override
	public void writeData(String data) {
		// TODO Auto-generated method stub

	}

	@Override
	public String readData() {
		// TODO Auto-generated method stub
		return null;
	}

}
