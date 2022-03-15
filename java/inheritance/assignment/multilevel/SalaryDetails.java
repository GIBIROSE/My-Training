package training.java.inheritance.assignment.multilevel;

public class SalaryDetails extends EmployeeSalaryComponents {
	private float hra;
	private float pf;

	public void hraCalculation() {
		hra = (5 * getBasicPay()) / 100;
	}

	public void pfCalculation() {
		pf = (20 * getBasicPay()) / 100;

	}

	public float getHra() {
		return hra;
	}

	public float getPf() {
		return pf;
	}

}
