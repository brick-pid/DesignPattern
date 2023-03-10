
public class DevBonus extends BonusStrategy {

	@Override
	public double getBonus(Programmer p) {
		int extraWorkTime = p.getExtraWorkTime();
		int limitTime = extraWorkTime > 5 ? 5 : extraWorkTime;
		return limitTime * 100 + 0.2 * p.getSalary();	
	}

}
