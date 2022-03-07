package training.assignments.abstract44;

public abstract class Employee {
	private String employeeName;
	private int paymentPerHour;

	
	

	public Employee(String employeeName,int paymentPerHour) {
		this.employeeName = employeeName;
		this.paymentPerHour = paymentPerHour;

	}

	public abstract void CalculateSalary();

	public String getEmployeeName() {
		return employeeName;
	}

	public int getPaymentPerHour() {
		return paymentPerHour;
	}
}
