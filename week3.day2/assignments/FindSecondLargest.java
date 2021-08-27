package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (Integer integer : data) {
			list.add(integer);
		}
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println("sorted list is " +list);
		
		System.out.println("Second largest number is " +list.get(1));
		
		
		
	}

}
