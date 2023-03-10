
public class Developer extends Programmer{
	public Developer(String name, String department, int age, double salary, String type) {
		super(name, department, age, salary, type);
	}
	@Override
	public double calculateBonus() {
		return this.getBonusStrategy().getBonus(this);
	}
}
