
public class OverdraftState extends AccountState {
	
	public OverdraftState(Account acc) {
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
		System.out.println("Overdraft Account: Compute Interest");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Overdraft Account";
	}


}
