
public class OverdraftState extends AccountState {
	
	public OverdraftState(Account acc) {
		this.acc = acc;
	}

	@Override
	public void deposit(double amount) {
		this.acc.setBalance(this.acc.getBalance() + amount);
		stateCheck();
	}

	@Override
	public void withdraw(double amount) {
		this.acc.setBalance(this.acc.getBalance() - amount);
		stateCheck();
	}

	@Override
	public void computeInterest() {
		System.out.println("Overdraft Account: Compute Interest");
	}

	@Override
	public void stateCheck() {
		double b = this.acc.getBalance();
		if(b >= 0) {
			this.acc.setState(new NormalState(this.acc));
		}
		if(b <= -2000) {
			this.acc.setState(new RestrictedState(this.acc));
		}
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Overdraft Account";
	}


}
