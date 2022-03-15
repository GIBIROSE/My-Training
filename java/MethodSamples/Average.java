package training.java.MethodSamples;

public class Average {
	int first;
	int second;
	int third;
	

	public Average(int first, int second, int third) {
		this.first = first;
		this.second = second;
		this.third = third;

	}
	

	
	

	public void averages(int first, int second, int third) {
		int average = (first + second + third) / 3;
		System.out.println("avg of int: " + average);
	}
	
	public void averages(float first, float second, float third)
	{
		float average=(first + second + third) / 3;
		System.out.println("avg of float: "+average);

	}

	public static void main(String[] args) {
		
		Average a= new Average(10,20,30);
		a.averages(10,20,30);
		a.averages(10f,20f,30f);
		
		
		
		
	}

}
