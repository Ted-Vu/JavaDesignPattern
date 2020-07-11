package structural.decorator;

public interface DataSource {

	// This example resembles the example input and output buffer from Java
	void writeData(String data);
	
	String readData();
}
