package trainingprograms.samples;

public class DiscountEligibility {
	static int total;

	public static void priceOfItems(int item1, int item2, int item3) {
		total = item1 + item2 + item3;

	}

	public static void discount() {
		if (total > 5000) {
			System.out.println("eligible for discount");

		} else {
			System.out.println("not eligible");
		}
	}

	public static void main(String[] args) {
		DiscountEligibility.priceOfItems(1000, 2000, 3000);
		System.out.println("Total: " + total);
		DiscountEligibility.discount();

	}

}
