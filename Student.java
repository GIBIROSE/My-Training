package training.java.aggregation.assignment;

public class Student {
	private String studentName;
	private String studentRollNumber;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentRollNumber() {
		return studentRollNumber;
	}

	public void setStudentRollNumber(String studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentName("Danny");
		student.setStudentRollNumber("PR14EC");

		Address add = new Address();
		add.setHouseName("602a");
		add.setStreet("Arasumood");

		add.setZipcode(689643);
		student.setAddress(add);
		System.out.println("Name of the student is :" + student.studentName);
		System.out.println("RollNumber is " + student.studentRollNumber);
		System.out
				.println("House name: " + student.getAddress().getHouseName());
		System.out.println("house street  " + student.getAddress().getStreet());
		System.out.println("Zipcode is " + student.getAddress().getZipcode());

	}
}
