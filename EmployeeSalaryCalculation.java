package training.assignments.abstract44;

public class EmployeeSalaryCalculation {

	public static void main(String[] args) {
		ContractEmployee contract = new ContractEmployee("Raja", 1000);

		contract.setWorkingHours(10);
		contract.displayNameContract();
		contract.CalculateSalary();
		PermanentEmployee permanent = new PermanentEmployee("Madhu", 1500);

		permanent.displayNamePermanent();
		permanent.CalculateSalary();

	}

}
