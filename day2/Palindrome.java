package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

		String s = "sundar";
		String rev = "";

		// System.out.println(s.length());

		for (int i = s.length() - 1; i >= 0; i--) {

			// System.out.println(s.charAt(i));
			rev = rev + s.charAt(i);
			//System.out.println(rev);
			if (s.equals(rev)) {
				System.out.println("It is a palindrome");
			} else {
				System.out.println("Given string is not a palindrome");
			}
		}

	}

}
