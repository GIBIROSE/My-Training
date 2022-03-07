package trainingprograms.samples;

public class ReversePalindromeCheck {
	static int reverse;

	public static void reverseNumber(int num) {
		while (num != 0) {
			int remainder = 0;
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println("reverse is :" + reverse);
	}

	public static void isPalindrome(int num) {
		if (num == reverse) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}

	public static void main(String[] args) {
	
		ReversePalindromeCheck.reverseNumber(1234);
		ReversePalindromeCheck.isPalindrome(1234);

	}

}
