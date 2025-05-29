package Comparator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo2 {
	
	public static void main(String[] args) {
		Comparator cmp = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				     String o11 = o1.toString();
				     String o22=  o2.toString();
				   
				     if(o11.length()<o22.length())
				    	 return 1;
				     else if(o11.length()>o22.length())
				    	 return -1;
				     else 
				     return 0;
			}
	                             	};               	
	        List<String>  lst = new ArrayList<String>();
	        lst.add("Praveen");
	        lst.add("Ram");
	        lst.add("Chintu");
	        lst.add("AkshayRaj");
	        
	        System.out.println("Before sorting");
	        System.out.println(lst);
	        
	        Collections.sort(lst,cmp);
	    
	        System.out.println("After sorting");
	        System.out.println(lst);
		
	}}


