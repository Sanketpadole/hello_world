package java_pckg;

public class Hellow1 {

	public static void main(String[] args) {
		int[] a = { 12, 3, 4, 56, 7 };
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		System.out.println(result);
	}
}
