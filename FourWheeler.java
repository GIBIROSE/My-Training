package training.java.inheritance.multilevel;

public class FourWheeler extends Vehicle {

	private String driveTrain;
	
	
	
	public void displayFourWheeler()
	{
		System.out.println("Drive train: "+getDriveTrain());
	}

	public String getDriveTrain() {
		return driveTrain;
	}

	public void setDriveTrain(String driveTrain) {
		this.driveTrain = driveTrain;
	}

}
