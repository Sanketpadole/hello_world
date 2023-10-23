package java_pckg;

public class PalindromeString {
//	public static void main(String[] args) {
//		String abc = "radard";
//		String originalString;
//		originalString = abc;
//		String nstr = "";
//		char ch;
//		for (int i = 0; i < abc.length(); i++) {
//
//			nstr = nstr + abc.charAt(i);
//
//		}
//		if (nstr.equals(abc)) {
//			System.out.println("palindrome_string");
//		} else {
//			System.out.println("non-palindrome_string");
//		}
//	}

	public static void main(String[] args) {
		String str = "radard";
		String nstr = "";
		for (int i = 0; i < str.length(); i++) {
			nstr = str.charAt(i) + nstr;

		}
		if (str.equals(nstr)) {
			System.out.println("palindrome");
		} else {
			System.out.println("non-palindrome");
		}
	}

}
