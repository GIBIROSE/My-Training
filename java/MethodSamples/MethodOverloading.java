package training.java.MethodSamples;

public class MethodOverloading {

	public void averageOfThreeNumbers(int num1, int num2, int num3) {
		int averageOfInt = (num1 + num2 + num3) / 3;
		System.out.println("Average of three integer numbers is: "
				+ averageOfInt);

	}

	public void averageOfThreeNumbers(float num1, float num2, float num3) {
		float averageOfFloat = (num1 + num2 + num3) / 3;
		System.out.println("Average of three float numbers is: "
				+ averageOfFloat);

	}

	public void area(float radius)

	{
		float areaOfCircle = (float) (3.14 * radius * radius);
		System.out.println("Area of Circle is:" + areaOfCircle);

	}

	public void area(int length, int breadth) {
		int areaOfRectangle = (length * breadth);
		System.out.println("Area of rectangle is: " + areaOfRectangle);
	}

	public void area(int side) {
		int areaOfSquare = side * side;
		System.out.println("Area of square is: " + areaOfSquare);
	}

	public static void main(String[] args) {
		MethodOverloading methodover = new MethodOverloading();
		methodover.averageOfThreeNumbers(10, 20, 30);
		methodover.averageOfThreeNumbers(10f, 20f, 30f);
		methodover.area(10.1f);
		methodover.area(10, 20);
		methodover.area(10);

	}

}
