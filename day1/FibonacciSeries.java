package week1.day1;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int firstnum = 0, secnum=1, sum=0, range = 9;
		
		System.out.println(firstnum);
		System.out.println(secnum);
		
		for(int i=2; i<range; i++)
		{
			sum=firstnum+secnum;
			firstnum = secnum;
			secnum=sum;
			System.out.println(sum);
		}
	}

}
