
public class RestrictedState extends AccountState {

	public RestrictedState(Account acc) {
		this.acc = acc;
	}
	
	@Override
	public void deposit(double amount) {
		this.acc.setBalance(this.acc.getBalance() + amount);
		this.acc.checkState();
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Account Restricted: withdraw failed!");
	}

	@Override
	public void computeInterest() {
		System.out.println("Restrict Account: Compute Interest");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Restricted Account";
	}

}
