
public class Account {
	private AccountState state;
	private double balance;
	private String ownerName;
	
	public void withdraw(double amount) {
		this.state.withdraw(amount);
	}
	
	public void deposit(double amount) {
		this.state.deposit(amount);
	}
	
	public AccountState getState() {
		return state;
	}
	public void setState(AccountState state) {
		this.state = state;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	@Override
	public String toString() {
		return state.toString() + "; balance:" + balance;
	}
	
	/**
	 * 由Context类来统一管理状态
	 */
	public void checkState() {
		if(balance < 0 && balance > -2000) {
			setState(new OverdraftState(this));
		}
		else if(balance <= -2000) {
			setState(new RestrictedState(this));
		}
		else {
			setState(new NormalState(this));
		}
	}
}
