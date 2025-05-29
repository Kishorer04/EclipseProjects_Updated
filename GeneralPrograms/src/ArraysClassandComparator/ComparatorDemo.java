package ArraysClassandComparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo implements Comparator {

	public static void main(String[] args) {
		
		
		String[] str= {"Ramesh","Suresh","Rajesh","Nila"};
		Arrays.sort(str, new ComparatorDemo());
		
		for(String s:str)
			System.out.println(s);

	}

	//This will sort in descending order
	@Override
	public int compare(Object o1, Object o2) {
		String s1 =o1.toString();
		String s2 = o2.toString();
		
		//This code will sort in descending order
		
		int result = s1.compareTo(s2);
		if(result>0)
			return -1;
		else if(result<0)
			return +1;
		else
		return 0;
		
		
		//This code will sort as per string length
		
//	     if(s1.length()>s2.length())
//	    	 return 1;
//	     else if(s1.length()>s2.length())
//	    	 return -1;
//	     else
//	    	 return 0;
	    	
	}

}
