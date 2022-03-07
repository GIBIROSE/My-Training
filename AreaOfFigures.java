package training.java.MethodSamples;

public class AreaOfFigures {
	
	

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
		AreaOfFigures area1 = new AreaOfFigures();
		area1.area(10.1f);
		area1.area(10, 20);
		area1.area(10);

	}

}
