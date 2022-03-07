package trainingprograms.samples;

public class AreaOfTriangle {

	public void areaDisplay(int base, int height) {
		float area = (base * height) / 2;
		System.out.println(area);

	}

	public static void main(String[] args) {

		AreaOfTriangle area = new AreaOfTriangle();
		area.areaDisplay(10, 20);
	}

}
