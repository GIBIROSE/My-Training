package trainingprograms.samples;

public class VowelConsonant {
	public void display() {
		char ch = 's';
		switch (ch) {
		case 'a':
			System.out.println("character is vowel");
			break;
		case 'e':
			System.out.println("character is vowel");
			break;
		case 'i':
			System.out.println("character is vowel");
			break;
		case 'o':
			System.out.println("character is vowel");
			break;
		case 'u':
			System.out.println("character is vowel");
			break;
		default:
			System.out.println("not vowel");
			break;

		}

	}

	public static void main(String[] args) {
		VowelConsonant vc = new VowelConsonant();
		vc.display();

	}

}
