package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		
		int[] data = {2,3,4,5,11,6,7,10};
		
		Arrays.sort(data);
		
		System.out.println("second largest array is " +data[data.length-2]);
	}

}
