package training.java.inheritance.assignment.multilevel;

public class MultilevelInheritance {

	public static void main(String[] args) {
		TotalSalary total = new TotalSalary();
		total.setBasicPay(10000);
		total.setDeduction(1000);
		total.setBonus(1000);
		total.totalSalaryCalculation();
		total.salarySlipDetails();

	}

}
