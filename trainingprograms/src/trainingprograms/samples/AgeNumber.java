package trainingprograms.samples;

public class AgeNumber {

	public void displayAgeName(int age, String name) {
		System.out.println(name);
		System.out.println(age);

	}

	public static void main(String[] args) {

		AgeNumber agename = new AgeNumber();
		agename.displayAgeName(10, "raj");
	}

}
