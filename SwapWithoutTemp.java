package trainingprograms.samples;

public class SwapWithoutTemp {

	public void display() {
		int x = 10;
		int y = 20;
		System.out.println("numbers before swapping");
		System.out.println("first num is: " + x);
		System.out.println("second number is:" + y);

		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("numbers after swapping");
		System.out.println("first num is: " + x);
		System.out.println("second number is:" + y);

	}

	public static void main(String[] args) {
		SwapWithoutTemp swap = new SwapWithoutTemp();
		swap.display();

	}
}