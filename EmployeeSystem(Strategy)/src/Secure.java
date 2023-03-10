
public class Secure extends Employee{
	private String area;
	public Secure(String name, String department, int age, double salary, String area) {
		super(name, department, age, salary);
		this.setArea(area);
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}

}
