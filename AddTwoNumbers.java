package trainingprograms.samples;

public class AddTwoNumbers {

	public void additionDisplay(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum of two numbers is :" + sum);
	}

	public static void main(String[] args) {

		AddTwoNumbers add = new AddTwoNumbers();
		add.additionDisplay(10, 20);

	}

}
