package training.java.inheritance.multilevel;

public class MultilevelInheritance {

	public static void main(String[] args) {

		Car car = new Car();
		car.setManufacturer("Volvo");
		car.setModelYear(2010);
		car.setTypeOfVehicle("Sedan");
		car.setColour("Black");
		car.setDriveTrain("2w");
		car.setVariantOfCar("VOLVO V2DVI");
		car.display();
		car.displayFourWheeler();
		car.print();

	}

}
