package training.java.inheritance.hierarchical;

public class OneDay extends Cricket {
	private String cricketWorldCupChampions;
	private boolean isSuperOver;

	public void oneDayCricketDetails() {
		System.out.println("Champions of 2020 world cup is:"
				+ cricketWorldCupChampions);
		System.out.println("super over is present " + isSuperOver);

	}

	public void setCricketWorldCupChampions(String cricketWorldCupChampions) {
		this.cricketWorldCupChampions = cricketWorldCupChampions;
	}

	public void setSuperOver(boolean isSuperOver) {
		this.isSuperOver = isSuperOver;
	}

}
