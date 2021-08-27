package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class PrintDups {
	
	public static void main(String[] args) {
		
		int[] arr = {14,12,11,13,15,14,18,16,17,19,18,17,20,12};
		
		List<Integer> lists = new ArrayList<Integer>();
		
		for (Integer integer : arr) {
			lists.add(integer);
		}
		
		
		System.out.println("list is " +lists);
		
		
		int count;
		
		for(int i = 0; i<lists.size(); i++)
		{
			count = 1;
			for(int j = i+1; j<lists.size(); j++) {
				
				if(lists.get(i)==lists.get(j))
				{
					count++;
				}
		}
			
			
			if(count>1)
			{
				System.out.println("dups in array list is " +lists.get(i));
			}
		}
		
		
		
		
		
	}

}
