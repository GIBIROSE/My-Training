package training.java.inheritance.single;

public class PostGraduateStudent extends Student {

	private String course;

	public void print() {
		//studentDetails();
		System.out.println("Course is :" + getCourse());
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
