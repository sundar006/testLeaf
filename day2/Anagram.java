package week1.day2;

import java.util.Arrays;

public class Anagram {

	
	public static void main(String[] args) {
		
		String text = "sundar";
		String text1 = "rdauns";
		
		if(text.length() == text1.length())
		{
			char[] ch = text.toCharArray();
			char[] ch1 = text1.toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(ch1);
			
			if(Arrays.equals(ch, ch1))
			{
				System.out.println("both words are anagram");
			}
			else
			{
				System.out.println("not an anagram");
			}
			
		}
		else {
			System.out.println("Given word is not an anagram");
		}
			
		}
	}

