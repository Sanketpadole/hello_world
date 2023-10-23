package java_pckg;

public class Palindrome_Num {
	public static void main(String[] args) {
		int num = 121;
		int originalNum = num;
		int rem;
		int rev = 0;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		if (rev == originalNum) {
			System.out.println("palindrome");

		} else {
			System.out.println("non-palindrome");
		}
	}

}
