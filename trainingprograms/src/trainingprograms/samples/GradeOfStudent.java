package trainingprograms.samples;

public class GradeOfStudent {

	public void display(int mark1, int mark2, int mark3) {
		float average = (mark1 + mark2 + mark3) / 3;
		if (average >= 81 && average <= 100) {
			System.out.println("Grade A");
		} else if (average >= 61 && average <= 80) {
			System.out.println("Grade B");
		} else {
			System.out.println("Other grades");
		}

	}

	public static void main(String[] args) {
		GradeOfStudent grade = new GradeOfStudent();
		grade.display(89, 78, 90);

	}

}
