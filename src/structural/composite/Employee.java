package structural.composite;

import java.util.List;

public interface Employee {

	String getName();
	
	long getSalary();
	
	List<Employee> getSubordinates();
	
}
