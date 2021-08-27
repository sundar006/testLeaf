package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingCollections {
	
	public static void main(String[] args) {
		
		//Aspire systems, cts, wipro, Hcl
	
	String[] arr = {"Aspire systems", "Cts", "wipro", "Hcl"};
	
	
	//get the length of array
	int len = arr.length;
	System.out.println("lenght of array is " +len);
	
	//sort the array
	Arrays.sort(arr);
	System.out.println("sorted array is " +Arrays.toString(arr));
	
	//sort using collections
	List<String> list = new ArrayList<String>();
	
	for(int i = 0; i< len; i++)
	{
		list.add(arr[i]);
	}
	
	System.out.println("Array to list conversion is " +list);
	
	Collections.sort(list);
	System.out.println("after sorting is " +list);
	
	//iterate by reverse order
	System.out.println(list.size());

	for(int i = list.size()-1; i>=0; i--)
	{
		System.out.println(list.get(i));
	}
	
	Collections.reverse(list);
	System.out.println("Reverse order is " +list);

	}
}
