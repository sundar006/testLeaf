package week1.day2;

import java.util.Iterator;

public class LearnString {
	
	public static void main(String[] args) {
		
		
		String str = "SundarS";
		
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(2));
		
		System.out.println(str.length());
		
		
		
		System.out.println(str.indexOf('d'));
		System.out.println(str.indexOf('S'));
		System.out.println(str.lastIndexOf('S'));
		
		
		
		
		char[]chArr = str.toCharArray();
		for(int i = 0; i<chArr.length; i++)
		{
			System.out.println("charArr["+i+"] :" +chArr[i]);
		}
	}

}
