package training.java.inheritance.hierarchical;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		OneDay day = new OneDay();
		day.setOrginatedPlace("England");
		day.setBallColour("White");
		day.setCricketWorldCupChampions("England");
		day.setSuperOver(true);

		System.out.println("one day cricket  originated in "
				+ day.getOrginatedPlace());
		System.out.println("Ball colour ODI " + day.getBallColour());
		day.oneDayCricketDetails();

		TestCricket test = new TestCricket();
		test.setOrginatedPlace("India");
		test.setBallColour("Red");
		test.setInnings(2);
	

		System.out.println("Test cricket is originated in "
				+ test.getOrginatedPlace());
		System.out.println("Ball colour in test : " + test.getBallColour());
		test.testCricketDetails();

	}
}
