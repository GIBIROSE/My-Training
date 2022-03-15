package training.java.gibi;

public class ReverseArray {

	public static void main(String[] args) {
		int inputarr[]=new int[5];
		 int outputrev[]=new int[5];
		 inputarr[0]=10;
		 inputarr[1]=14;
		 inputarr[2]=12;
		 inputarr[3]=11;
		 inputarr[4]=8;
		 
		 
		 System.out.println("Array elements before reversing");
		 for(int i=0;i<inputarr.length;i++)
		{
		 System.out.println(inputarr[i]);

		}
		 
		 int arrayCount=inputarr.length-1;
		 
		 for(int i=0;i<=arrayCount;i++)
		 {
			 outputrev[arrayCount-i]=inputarr[i];
		 }
		 System.out.println("Array after reversing");
		 for(int i=0;i<outputrev.length;i++)
		 {
			 System.out.println(outputrev[i]); 
		 }
				 


		 

	}

}
