package week1.day2;

public class CalculatorOperations {
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(2, 3, 4));
		System.out.println(calc.sub(30, 2));
		System.out.println(calc.mul(2, 500));
		System.out.println(calc.divide(20, 10.5F));
	}

}
