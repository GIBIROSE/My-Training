package training.java.Method.assignment;

public class OffSeason extends OnSeason {

	@Override
	public void discount() {
		super.discount();

		float discount = (getTotalAmount() * 15) / 100;
		System.out.println("Discount in offseason:  " + discount);

	}

}
