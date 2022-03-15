package trainingprograms.samples;

public class EvenNumbersPrint {

	public void display(int num) {
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
	}

	public static void main(String[] args) {
		EvenNumbersPrint evennum = new EvenNumbersPrint();
		evennum.display(20);

	}

}
