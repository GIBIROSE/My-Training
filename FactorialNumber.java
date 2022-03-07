package trainingprograms.samples;

public class FactorialNumber {

	public static void factorialNum(int num) {

		int factorial = 1;
		for (int i = 1; i <= num; ++i) {
			factorial = factorial * i;

		}
		System.out.printf("Factorial is :" + factorial);
	}

	public static void main(String[] args) {
		FactorialNumber.factorialNum(10);

	}

}
