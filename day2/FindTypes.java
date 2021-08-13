package week1.day2;

public class FindTypes {
	
	public static void main(String[] args) {
		
		String test = "$$ welcome to 2nd class$$";
		
		int letter = 0, space = 0, num = 0, specialChar = 0;
		
		
		//find letter
		char[] ch = test.toCharArray();
		
		for(int i = 0; i<ch.length; i++)
		{
			if(Character.isLetter(i))
			{
				System.out.println("letter:  " +letter);
			}
			
			if(Character.isDigit(i))
			{
				System.out.println("Digits are " +num);
			}

		}
	}

}
