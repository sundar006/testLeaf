package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i<arr.length; i++)
		{
			list.add(arr[i]);
			
			if(list.get(i)!= i)
			{
				System.out.println("missing element is " +i);
			}
			
		}
		
		
		System.out.println(list);
		
		/*
		 * for (Integer integer : arr) {
		 * 
		 * list.add(integer); Collections.sort(list);
		 * 
		 * if(list.get(integer)!= integer) { System.out.println("Missing element is "
		 * +integer); } }
		 */
	}

}
