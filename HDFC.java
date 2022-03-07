package training.interfacesamples46;

public class HDFC implements RBI {
	private float interestAmount;

	private float totalAmount;

	@Override
	public void recurringDeposit(int amount, int duration) {
		interestAmount = (amount * duration * INTERESTRATE) / (100 * 12);

		System.out.println("Interest rate for the duration: " + interestAmount);
		display(amount);

	}

	public void display(int amount) {
		totalAmount = interestAmount + amount;

		System.out.println("Total amount after duration:" + totalAmount);
	}

}
