package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class SimpleEmployee implements Employee {

	private String name;
	protected long salary;
	private List<Employee> noSubordinate = new ArrayList<>();

	public SimpleEmployee(String name, long salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public long getSalary() {
		return salary;
	}

	@Override
	public List<Employee> getSubordinates() {
		return noSubordinate;
	}

	@Override
	public String toString() {
		return "SimpleEmployee [name=" + name + ", salary=" + salary + "]";
	}
	


}
