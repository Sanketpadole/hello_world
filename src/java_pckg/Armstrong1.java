package java_pckg;

public class Armstrong1 {
	public static void main(String[] args) {
		int num = 153;
		int rem;
		int originalNum;
		double result = 0;
		originalNum = num;
		while (num != 0) {
			rem = num % 10;
			result = result + Math.pow(rem, 3);
			num = num / 10;

		}
		if (result == originalNum) {
			System.out.println("armstrongNum");
		} else {
			System.out.println("non-armstrongNum");

		}
	}

}
