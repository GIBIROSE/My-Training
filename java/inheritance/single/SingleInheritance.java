package training.java.inheritance.single;

public class SingleInheritance {

	public static void main(String[] args) {

		PostGraduateStudent student = new PostGraduateStudent();

		student.setStudentName("Gibi");
		student.setStudentID("EC13");
		student.setCourse("M-Tech ECE");
		student.print();
		student.studentDetails();

	}

}
