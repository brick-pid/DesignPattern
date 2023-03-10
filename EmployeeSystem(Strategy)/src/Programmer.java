
public abstract class Programmer extends Employee{
	private String type; // java or c
	private int extraWorkTime; //¼Ó°à´ÎÊý
	private BonusStrategy bs;
	
	public Programmer(String name, String department, int age, double salary, String type) {
		super(name, department, age, salary);
		this.setType(type);
	}
	
	public void setBonusStrategy(BonusStrategy bs) {
		this.bs = bs;
	}
	public BonusStrategy getBonusStrategy() {
		return this.bs;
	}
	
	public void setExtraWorkTime(int t) {
		 this.extraWorkTime = t;
	}
	
	public int getExtraWorkTime() {
		return this.extraWorkTime;
	}
	
	public abstract double calculateBonus();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
