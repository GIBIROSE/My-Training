package training.java.MethodSamples;

public class Sample1 {
	int num1;
	int num2;
	int num3;
	float num4;
	float num5;
	float num6;

	public Sample1(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public Sample1(float num4, float num5, float num6) {
		this.num6 = num6;
		this.num4 = num4;
		this.num5 = num5;
	}

	public void averageOfThreeNumbers(int num1, int num2, int num3) {
		int averageOfInt = (num1 + num2 + num3) / 3;
		System.out.println("Average of three integer numbers is: "
				+ averageOfInt);

	}

	public void averageOfThreeNumbers(float num4, float num5, float num6) {
		float averageOfFloat = (num4 + num5 + num6) / 3;
		System.out.println("Average of three float numbers is: "
				+ averageOfFloat);

	}

	public static void main(String[] args) {

		Sample1 s1 = new Sample1(10, 20, 30);
		s1.averageOfThreeNumbers(10, 20, 30);

		s1.averageOfThreeNumbers(10f, 20f, 30f);

	}

}
