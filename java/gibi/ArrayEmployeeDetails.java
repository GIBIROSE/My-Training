package training.java.gibi;
import training.java.gibi.EmployeeDetails;

public class ArrayEmployeeDetails {

	public static void main(String[] args) {
		
		EmployeeDetails emp[]=new EmployeeDetails[10];
		EmployeeDetails ed1=new EmployeeDetails("Anu", " M V", 10);
		EmployeeDetails ed2=new EmployeeDetails("Manu","Madhav",20);
		EmployeeDetails ed3=new EmployeeDetails("Amy","S V",40);
		EmployeeDetails ed4=new EmployeeDetails("Gauri","rani",45);
		EmployeeDetails ed5=new EmployeeDetails("Rani", "Rampal",23);
		EmployeeDetails ed6=new EmployeeDetails("Neeraj","Chopra",24);
		EmployeeDetails ed7=new EmployeeDetails("Manav", "Singh",50);
		EmployeeDetails ed8= new EmployeeDetails("Deeraj","S. R",34);
		EmployeeDetails ed9=new EmployeeDetails("Mahima","Thomas", 30);
		EmployeeDetails ed10=new EmployeeDetails("Radhika","R",21);
		emp[0]=ed1;
		emp[1]=ed2;
		emp[2]=ed3;
		emp[3]=ed4;
		emp[4]=ed5;
		emp[5]=ed6;
		emp[6]=ed7;
		emp[7]=ed8;
		emp[8]=ed9;
		emp[9]=ed10;
		for(EmployeeDetails empdet:emp)
		{
			empdet.display();
		}
		
		
		
		
		

	}

}
