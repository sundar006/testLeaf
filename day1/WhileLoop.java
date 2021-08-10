package week1.day1;

public class WhileLoop {

	public static void main(String[] args) {

		int sum = 1234;
		int quotient = 1;
		int add = 0;
		int remainder = 0;

		while (quotient != 0) {

			quotient = sum / 10;
			remainder = sum % 10;
			sum = quotient;
			add = add + remainder;

		}

		System.out.println("Total num is " + add);

	}

}
