package training.java.encapsulation;

public class User {

	public static void main(String[] args) {

		Bank bank = new Bank();
		bank.setPin(1234);
		bank.display();
		bank.validate();

	}

}
