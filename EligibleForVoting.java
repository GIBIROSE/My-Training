package trainingprograms.samples;

public class EligibleForVoting {
	static int age = 20;

	public static boolean display() {
		if (age >= 18) {
			return true;
		} else {

			return false;

		}
	}

	public static void main(String[] args) {
		boolean value=EligibleForVoting.display();
		if(value==true){
			System.out.println("eligible for voting");
		}
		else{
			System.out.println("not eligible");
		}
		
		
	}

}
