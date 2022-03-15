package training.java.inheritance.assignment.multilevel;

public class TotalSalary extends SalaryDetails {

	private  float totalSalary;

	public void totalSalaryCalculation() {
		totalSalary = getBasicPay() + getHra() - getPf() - getDeduction()
				+ getBonus();
		hraCalculation();
		pfCalculation();
		
	}

	public  void salarySlipDetails() {
		System.out.println("Basic pay is :" + getBasicPay());
		System.out.println("Deduction is :" + getDeduction());
		System.out.println("HRA  is :" + getHra());
		System.out.println("Provident fund  is :" + getPf());
		System.out.println("Bonus  is :" + getBonus());

		System.out.println("Total Salary in hand:  " + totalSalary);
		
		

	}

}
