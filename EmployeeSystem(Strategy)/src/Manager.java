import java.util.ArrayList;
import java.util.List;

public abstract class Manager extends Employee {
	private List<Employee> employees;

	public Manager(String name, String department, int age, double salary) {
		super(name, department, age, salary);
		this.employees = new ArrayList<>();
	}
	
	public String inquire(Employee e) throws IllegalArgumentException {
		if(this.getDepartment().equals(e.getDepartment())) {
			if(employees.contains(e)) {
				return e.toString();				
			}else {
				return e.getName() + " is not lead by " + this.getName();
			}
		}
		throw new IllegalArgumentException("error department: e.department != m.department");
	}
	
	// add employee for manager if the department match
	public boolean lead(Employee e) {
		if(this.getDepartment().equals(e.getDepartment())) {
			this.employees.add(e);
			return true;
		}
		return false;
	}
	
}
