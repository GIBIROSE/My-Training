
public class Reverse {
	int digit;
	int num;
	int reverse=0;
	
	
	public int number()
	{
	
	while(digit!=0)
	{
		num=digit%10;
		reverse=reverse*10+num;
		digit/=10;
	}
	System.out.println(reverse);
	return reverse;
	}
	/*public void palindrome()
	{
		if(reverse==digit)
		{
			System.out.println(" Number is palindrome");
			
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}*/

	public static void main(String args[])
	{
		System.out.println("Enter the number: " +args[0]);
		//String digit=args[0];
		System.out.println(Integer.parseInt(args[0]));
		
		Reverse obj=new Reverse();
		obj.number();
		//obj.palindrome();
		
	}

}
