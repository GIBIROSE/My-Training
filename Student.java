package training.java.inheritance.single;

public class Student {

	private String studentName;
	private String studentID;

	public void studentDetails() {
		System.out.println("Student name is :" + studentName);
		System.out.println("Student ID is: " + studentID);

	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

}
