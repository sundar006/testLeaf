package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetAssignment {
	
	public static void main(String[] args) {
		
		String st = "Paypal India";
		LinkedHashSet<Character> charSet = new LinkedHashSet<Character>();
		LinkedHashSet<Character> dupCharSet = new LinkedHashSet<Character>();
		char[] ch = st.toCharArray();		
		
		
		for (char c : ch) {
			if(!charSet.add(c))
			{
				dupCharSet.add(c);	
			}
		}
		
		System.out.println(dupCharSet);
		
		
		//LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		/*
		 * for(int i = 0; i<st.length(); i++) { set.add(st.charAt(i)); }
		 * System.out.println("Before removing the dups " +st);
		 * 
		 * for(Character ch : set)
		 * 
		 * System.out.println("After removing the dups " +ch);
		 */
		
		
		
		
		
		/*
		 * Set<Character> charSet = new LinkedHashSet<Character>(); Set<Character>
		 * dupCharSet = new LinkedHashSet<Character>();
		 * 
		 * //iterate character array and add into charSet
		 * 
		 * for(int i = 0; i<ch.length; i++) { charSet.add(ch[i]);
		 * 
		 * if(charSet.equals(ch[i])) { dupCharSet.add(ch[i]); }
		 * 
		 * }
		 * 
		 * System.out.println(charSet); System.out.println(dupCharSet);
		 */
		
		
		
		
		
	}

}
