package week1.day2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LearnArray {
	
	public static void main(String[] args) {
		
		String[] str = {"hi","hello","welcome"};
		int[] intarr = {12,345,63465,345,234,23234};
		
		
		System.out.println(intarr.length);
		System.out.println(intarr[2]);
		
		
		
		Arrays.sort(intarr);
		for(int i = 0; i < intarr.length; i++)
		{
			System.out.println("intarr["+i+"]=" +intarr[i]);
		}
		
		
		//find the largest number
		System.out.println(intarr[intarr.length-1]);
		
		System.out.println(intarr[intarr.length-2]);
		//find second smallest number
		//Collections.reverseOrder(intarr);
		
	}

}
