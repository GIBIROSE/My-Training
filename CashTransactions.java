package training.assignments.abstract44.programs.abstractionprograms45;

public abstract class CashTransactions {

	private float balance;
	private float interestRate = 5.1f;

	public CashTransactions(float balance) {

		this.balance = balance;
	}

	public void deposit(float depositAmount) {
		System.out.println("InitialBalance:" + balance);
		balance = balance + depositAmount;
		System.out.println("balance after deposit: " + getBalance());
	}

	public void withdrawal(float withdrawalAmount) {
		balance = balance - withdrawalAmount;
		System.out.println("balance after withdrawal: " + getBalance());
	}

	public abstract void interestAmountCalculation();

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float getInterestRate() {
		return interestRate;
	}
}
