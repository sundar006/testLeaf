package week1.day2;

public class CharOccurence {
	
	public static void main(String[] args) {
		
		String str = "weleecome homee";
		int count = 0;
		
		char[] ch = str.toCharArray();
		
		int length = str.length();
		
		for(int i=0; i <length; i++)
		{
			if(str.charAt(i) == 'e' )
			{
				count ++;
			}
		}
		System.out.println("number of occurences of the letter e is " +count);
	}

}
