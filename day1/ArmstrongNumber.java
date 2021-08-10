package week1.day1;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int input = 153;
		int calculated = 0;
		int remainder;
		int quotient =1;
		
		int i = input;
		
		while(quotient!=0)
		{
			quotient = i/10;
			remainder = i%10;
			i = quotient;
			calculated = calculated+ (remainder * remainder * remainder);
		}
		
		if(calculated == input)
		{
			System.out.println("Given " +input+ " is Armstrong");
		}
		else {
			System.out.println("Given " +input+ " is not an Armstrong");
		}
	}

}
