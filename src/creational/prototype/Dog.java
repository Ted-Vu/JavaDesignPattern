package creational.prototype;

// Java supports prototype pattern with Cloneable interface
public class Dog implements Cloneable {
	private String name;

	public Dog(String name) {
		this.name = name;
	}
	
	public Dog(Dog dog) {
		this.name=dog.name;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return (Dog) super.clone();
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}

}
