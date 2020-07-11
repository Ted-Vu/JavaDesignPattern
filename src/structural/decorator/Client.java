package structural.decorator;

public class Client {

	public void run() {

		// wrapping behaviour here
		DataSource dataSource = new DataSourceDecorator(new EncryptionDecorator(new FileDataSource("filename")));

		dataSource.writeData("Some Data");
		dataSource.readData();
	}
}
