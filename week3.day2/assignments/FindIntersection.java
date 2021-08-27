package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		int[] arr= {3,2,4,6,5};
		int[] arr1= {3,7,9,0,12,4,5};
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		
		
		for (Integer integer : arr) {
			list.add(integer);
		}
		
		for(Integer ints :arr1)
		{
			list1.add(ints);
		}
		
		
		System.out.println(list);
		System.out.println(list1);
		
		for(int i = 0; i<list.size(); i++)
		{
			for(int j = 0; j<list1.size(); j++)
			{
				if(list.get(i)==list1.get(j))
				{
					System.out.println(list.get(i));
				}
			}
		}
		
	}

}
