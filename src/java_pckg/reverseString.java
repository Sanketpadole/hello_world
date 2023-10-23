package java_pckg;

public class reverseString {
	public static void main(String[] args) {
		String str = "hello";
		String nstr = "";
		for (int i = 0; i < str.length(); i++) {
			nstr = str.charAt(i) + nstr;

		}
		System.out.println(nstr);
	}

}
