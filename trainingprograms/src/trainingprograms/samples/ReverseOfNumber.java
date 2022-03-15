package trainingprograms.samples;

public class ReverseOfNumber {

	public void display(int num) {
		int reverse = 0;
		while (num != 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;

		}
		System.out.println("Reverse is:" + reverse);
	}

	public static void main(String[] args) {
		ReverseOfNumber reversed = new ReverseOfNumber();
		reversed.display(1234);

	}

}
