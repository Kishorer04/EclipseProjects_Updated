package com.galaxe.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
	
	public static Integer[] arrayAdd(Integer arr[],Integer n) 
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(n,3);
		arr=arrayList.toArray(arr);	
		return arr;
		
	}

	public static void main(String[] args) {
		Array arrayList = new Array();
		Integer arr[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(arr));
		//element to be added
		int x=6;
		arr=arrayAdd(arr,x);
		System.out.println(Arrays.toString(arr));
	}

}
