package training.assignments.abstract44.programs.abstractionprograms45;

public class AbstractionSample {

	public static void main(String[] args) {

		PunjabNationalBank pnb = new PunjabNationalBank(10000);
		pnb.deposit(1000);
		pnb.withdrawal(500);
		pnb.interestAmountCalculation();

		AndhraBank ab = new AndhraBank(8000);
		ab.deposit(500);
		ab.withdrawal(900);
		ab.interestAmountCalculation();
	}

}
