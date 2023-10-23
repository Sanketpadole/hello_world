package java_pckg;

public class armstrong2 {
	public static void main(String[] args) {
		int num = 154;
		double result = 0;
		int rem;
		int originalNum;
		originalNum = num;
		while (num != 0) {
			rem = num % 10;
			result = result + Math.pow(rem, 3);
			num = num / 10;

		}
		if (originalNum == result) {
			System.out.println("armstrongNum");
		} else {
			System.out.println("non-armstrongNum");

		}
	}

}
