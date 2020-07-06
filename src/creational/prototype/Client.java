package creational.prototype;

public class Client {

	public void run() {

		try {
			Dog dog = new Dog("Golden Retriever");

			Dog clonedDog = (Dog) dog.clone();

			// Two objects above have separate memory space changing one will not affect others
			// as opposed to simply write clonedDog = dog
		
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}
}
