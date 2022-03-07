package training.java.inheritance.multilevel;

public class Vehicle {
	private String manufacturer;
	private int modelYear;
	private String colour;

	public void display() {
		System.out.println("Manufacturer name is :" + manufacturer);
		System.out.println("Model year is :" + modelYear);
		System.out.println("Colour of the vehicle is " + colour);

	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
