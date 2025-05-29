package Comparator_Comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo3{
	
	public static void main(String[] args) {
		
		
		Comparator cmp = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				String s1= (String) o1;
				String s2 =(String) o2;
				
				int result = s1.compareTo(s2); //This compareTo method is in String class. This is not the compareTo 
				                               //method of Comparable interface
				if(result>0)
					return -1;
				else if(result<0)
					return +1;
				else
				return 0;
			}	
			
		};
		
		List<String> ls=  Arrays.asList("Kishore","Vinayak","Praveen","Balaji");
		
		Collections.sort(ls,cmp);
		
		System.out.println(ls);
	}
}