package trainingprograms.samples;

public class GreatestOfThreeNumbers {

	public void display(int num1, int num2, int num3) {
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("Number1 is biggest");

		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("Number2 is biggest");
		} else {
			System.out.println("Number 3 is biggest");
		}

	}

	public static void main(String[] args) {

		GreatestOfThreeNumbers greatest = new GreatestOfThreeNumbers();
		greatest.display(10, 20, 30);

	}

}
