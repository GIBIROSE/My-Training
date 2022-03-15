package training.java.inheritance.multilevel;

public class Car extends FourWheeler {
	private String variantOfCar;
	private String typeOfVehicle;

	public void print() {
		System.out.println("Type of vehicle is: " + typeOfVehicle);
		System.out.println("Variant of the vehicle is :" + variantOfCar);

	}

	public void setVariantOfCar(String variantOfCar) {
		this.variantOfCar = variantOfCar;
	}

	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}

}
