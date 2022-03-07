package training.java.encapsulation;

public class Bank {
	private int pin;

	public void setPin(int pin) {
		this.pin = pin;

	}

	public int getPin() {
		return pin;
	}

	public void display() {
		if (pin == 1001 || pin == 1234 || pin == 1212) {
			System.out.println("Pin is ok");

		} else {
			System.out.println("Invalid pin");
		}
	}

	public void validate() {
		System.out.println("Pin is: " + getPin());
	}

}
