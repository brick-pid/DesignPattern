
public abstract class Employee {
	private String name;
	private String department;
	private int age;
	private double salary;
	
	public Employee(String name, String department, int age, double salary) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }
	
	public String getName() {
		return this.name;
	}
	public void setName(String n) {
		this.name = n;
	}
	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String d) {
		this.department = d;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int a) {
		this.age = a;
	}
	public double getSalary() {
		return this.salary;
	}
	public void setSalary(double s) {
		this.salary = s;
	}
}
