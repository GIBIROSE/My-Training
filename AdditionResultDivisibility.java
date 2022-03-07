package training.java.MethodSamples;

public class AdditionResultDivisibility extends AdditionOfTwoNumbers {

	@Override
	public void sumOfTwoNumbers(int num3, int num4) {
		super.sumOfTwoNumbers(num3, num4);
		System.out.println("Sum of two numbers is:"+getSum());
		if (getSum() % 10 == 0) {
			System.out.println("Divisible by 10");
		} else {
			System.out.println("Not divisible by 10");

		}

	}

}
