
public class NormalState extends AccountState {

	public NormalState(Account acc) {
		this.acc = acc;
	}
	
	@Override
	public void deposit(double amount) {
		this.acc.setBalance(this.acc.getBalance() + amount);
		this.acc.checkState();
	}

	@Override
	public void withdraw(double amount) {
		this.acc.setBalance(this.acc.getBalance() - amount);
		this.acc.checkState();
	}

	@Override
	public void computeInterest() {
		System.out.println("Normal Account has no interest");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Normal Account";
	}

}
