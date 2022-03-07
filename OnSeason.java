package training.java.Method.assignment;

public class OnSeason {
	private int totalAmount;

	public int getTotalAmount() {
		return totalAmount;
	}

	public void totalAmount(int item1, int item2) {
		totalAmount = item1 + item2;
		System.out.println("Total amount is: " + totalAmount);

	}

	public void discount() {
		float discount = (getTotalAmount() * 40) / 100;
		System.out.println("Discount in onseason " + discount);

	}

}
