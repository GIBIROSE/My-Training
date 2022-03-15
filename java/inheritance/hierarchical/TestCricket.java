package training.java.inheritance.hierarchical;

public class TestCricket extends Cricket {
	private int innings;

	public void testCricketDetails() {
		System.out.println("Number of innings in test " + getInnings());

	}

	public int getInnings() {
		return innings;
	}

	public void setInnings(int innings) {
		this.innings = innings;
	}

}
