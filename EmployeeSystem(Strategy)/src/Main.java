
public class Main {

	public static void main(String[] args) {
		Manager m = new ProgrammerManager("tom", "Programming", 40, 100);
		Programmer p = new Developer("Pime", "Programming", 24, 70, "java");
		p.setExtraWorkTime(10);
		p.setBonusStrategy(new DevBonus());
		System.out.println("lead " + p.getName() + " " + m.lead(p));
		System.out.println("inquire team meamber " + p.getName() + m.inquire(p));
		System.out.println("calc bonus " + p.calculateBonus());
		
		System.out.println("----------");
		Employee secure = new Secure("Kate", "Security", 33, 60, "A");
		System.out.println("pm try to lead secure: " + m.lead(secure));
		
		System.out.println("----------");
		try {
			m.inquire(secure);
		} catch (Exception e) {
			System.out.println("catch "+ e.toString());
			e.printStackTrace();
		}
	}
}
