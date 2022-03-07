package training.assignments.abstract44.programs.abstractionprograms45;

public class PunjabNationalBank extends CashTransactions {

	public PunjabNationalBank(float balance) {
		super(balance);

	}

	@Override
	public void interestAmountCalculation() {
		float interestAmount = (getBalance() * getInterestRate()) / 100;
		System.out.println("Interest amount is: " + interestAmount);
		finalAmount(interestAmount);

	}
	public void finalAmount(float interestAmount) {
		float netAmount = interestAmount + getBalance();
		System.out.println("Final amount is: " + netAmount);
	}

}
