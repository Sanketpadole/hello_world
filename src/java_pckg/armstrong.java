package java_pckg;

public class armstrong {
	public static void main(String[] args) {
		int num = 153;
		int rem;
		double result = 0;
		int originalNumber;
		originalNumber = num;
		while (num != 0) {
			rem = num % 10;
			result = result + Math.pow(rem, 3);
			num = num / 10;

		}
		if (result == originalNumber) {
			System.out.println("no is armstrong number");

		} else {
			System.out.println("not armstrong number");

		}

	}

//	public static void main(String[] args) {
//		int number = 153;
//		int remainder;
//		int originalNumber;
//
//		double result = 0;
//
//		originalNumber = number;
//		while (originalNumber != 0) {
//			remainder = originalNumber % 10;
//			result = result + Math.pow(remainder, 3);
//			originalNumber = originalNumber / 10;
//		}
//		if (result == number)
//			System.out.println("no is armstrong number");
//		else {
//			System.out.println("not armstrong number");
//
//		}
//	}
}
