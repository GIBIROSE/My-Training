package trainingprograms.samples;

public class IsEligibleForLicensee {

	public void display(int age) {
		if (age >= 18) {
			System.out.println("eligible for licensee");
		} else {
			System.out.println("Not eligible for voting");
		}
	}

	public static void main(String[] args) {

		IsEligibleForLicensee licensee = new IsEligibleForLicensee();
		licensee.display(20);

	}

}
