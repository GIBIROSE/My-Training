package training.java.gibi;

public class SampleLearn
{
	static int num1;
	static int num2;
	

	public SampleLearn(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public static void display()
	{   //int add=0;
		System.out.println(num1);
		System.out.println(num2);
		//add=num1+num2;
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		//return add;
		//addDisplay(add);
	}
	
	
	/*public void addDisplay(int adds)
	{
		System.out.println("added value is :"+adds);
	}
	*/
	
	public static void main(String[] args)
	{
		System.out.println("Helloworld");
		SampleLearn sle=new SampleLearn(30,10);
		SampleLearn.display();
        //sle.display();
        
        //System.out.println("addition of two values is :"+value);
	}

}
