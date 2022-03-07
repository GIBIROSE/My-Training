package training.assignments.abstract44;

public class PermanentEmployee extends Employee {
	

	public PermanentEmployee(String employeeName,int paymentPerHour) {
		super(employeeName, paymentPerHour);

	}

	public void displayNamePermanent() {
		System.out.println("Name of permanent employee :" + getEmployeeName());
	}

	@Override
	public void CalculateSalary() {
		int totalSalary = getPaymentPerHour() * 8;
		System.out.println("Total salary  of permanent empoyee is: "
				+ totalSalary);
	}

	
	

}
