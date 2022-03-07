package trainingprograms.samples;

public class EvenOdd {

	public void display(int num) {
		if (num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

	public static void main(String[] args) {
		EvenOdd eo = new EvenOdd();
		eo.display(10);

	}

}
