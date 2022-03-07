package training.assignments.abstract44;

public class ContractEmployee extends Employee {

	private int workingHours;

	public ContractEmployee(String employeeName, int paymentPerHour) {
		super(employeeName, paymentPerHour);}
	

	

	public void displayNameContract() {
		System.out.println("Name of the contract employee :"
				+ getEmployeeName());
	}

	@Override
	public void CalculateSalary() {
		int totalSalary = getPaymentPerHour() * workingHours;
		System.out.println("Total Salary of contract employee is: "
				+ totalSalary);

	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

}
