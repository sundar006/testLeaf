package week1.day1;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int input = 13;
		boolean isPrime = false;
		int range = input/2;
		
		for(int i = 2;i< range;i++)
		{
			if(input%i==0)
			{
				System.out.println("Given " +input+ " is not a Prime number");
				isPrime = true;
				break;
			}
			if(isPrime == false)
			{
				System.out.println("Given " +input+ " is a Prime number");
			}
			
			
			
		}
		
	}

}
