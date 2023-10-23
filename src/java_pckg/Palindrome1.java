package java_pckg;

public class Palindrome1 {
	public static void main(String[] args) {
		int num = 121;
		int rem;
		int rev = 0;
		int originalNum = 0;
		originalNum = num;

		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		if (originalNum == rev) {
			System.out.println("palindrome");
		} else {
			System.out.println("non-palindrome");

		}
	}

}
