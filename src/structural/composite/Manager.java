package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends SimpleEmployee {

	private List<Employee> subordinate = new ArrayList<>();

	public Manager(String name, long salary) {
		super(name, salary);
	}

	public void add(Employee employee) {
		subordinate.add(employee);
	}

	public void remove(Employee employee) {
		subordinate.remove(employee);
	}

	public long getSalary() {
		long sum = salary;

		for (Employee e : subordinate) {
			sum += e.getSalary();
		}

		return sum;
	}

	public List<Employee> getSubordinate() {
		return subordinate;
	}
}
