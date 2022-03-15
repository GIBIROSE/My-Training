package training.java.gibi;

public class EmployeeDetails {
	private String firstname;
	private String lastname;
	private int age;
	
	
	public EmployeeDetails(String firstname, String lastname, int age )
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.age=age;
		
	}
	public void display()
	{
		System.out.println("FirstName : "+firstname + "  LastName : " +lastname   +"   Age : "+age );
		
	}
	
	
	

}
		
		

	
