package week1.day2;

import java.util.Arrays;

public class ChangeOddIndexToUpperCase {
	
	public static void main(String[] args) {
		
		String s = "sundar kumar";
		String op = "";
		
		//char[] ch = new char[s.length()];
		
		for(int i = 0; i<s.length();i++)
		{
			if(i%2==0)
			{
				op = op + Character.toLowerCase(s.toCharArray()[i]);
			}
			else {
				op = op + Character.toUpperCase(s.toCharArray()[i]);
			}
			
			
		}
		
		System.out.println(op);
	}

}
