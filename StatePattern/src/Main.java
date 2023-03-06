
public class Main {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.setState(new NormalState(acc));
		
		acc.setBalance(100);
		System.out.println(acc);
		
		acc.deposit(100);
		System.out.println(acc);
		
		acc.withdraw(150);
		System.out.println(acc);
		
		acc.withdraw(100);
		System.out.println(acc);
		
		acc.withdraw(2000);
		System.out.println(acc);
		
		acc.withdraw(100);
		System.out.println(acc);

	}

}
