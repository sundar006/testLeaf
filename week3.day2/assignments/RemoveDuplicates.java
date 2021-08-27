package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
	
	
	String text = "we learn in java basics as part of java session in java week1 session";
	int count = 1;
	
	String[] words = text.split(" ");
	
	
	Set<String> uniqueWords = new LinkedHashSet<String>();
	Set<String> dupWords = new LinkedHashSet<String>();
	
	for (String string : words) 
	{
		
		if(!uniqueWords.add(string))
		{
			dupWords.add(string);
		}
	}
	
	System.out.println(uniqueWords);
	System.out.println(dupWords);
	

}
}