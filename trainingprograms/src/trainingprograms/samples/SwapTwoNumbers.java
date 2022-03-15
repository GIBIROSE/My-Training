package trainingprograms.samples;

public class SwapTwoNumbers {

	public void display() {
		int firstNumber = 10;
		int secondNumber = 20;
		System.out.println("numbers before swapping");
		System.out.println("first num is: " + firstNumber);
		System.out.println("second number is:" + secondNumber);

		int temporary = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temporary;

		System.out.println("numbers after swapping");
		System.out.println("first num is: " + firstNumber);
		System.out.println("second number is:" + secondNumber);
	}

	public static void main(String[] args) {
		SwapTwoNumbers swap = new SwapTwoNumbers();
		swap.display();

	}

}
