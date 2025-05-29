package static_default_predicate_demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Ticket_Booking {

	public static void main(String[] args) {
		
		
//		Predicate<Integer> p = no-> no>60;
//		System.out.println(p.test(77));
		
//		Predicate<String> p = name->name.length()>=8;
//		System.out.println(p.test("12kishor"));
	
//		List<Integer> li = new ArrayList();
//		li.add(4);
//		System.out.println(li.size());
//		
//		Predicate<Collection> p = al -> al.size()>0;
//		System.out.println(p.test(li));
		
		
//		//Predicate in Array
//		int[] ar= {2,4,5,6};
//		
//		Predicate<Integer> p = n->n%2!=0;
//		
//		for(int i=0;i<ar.length;i++)
//		 System.out.println( p.test(ar[i]));
		
		//The actual method should have been written like this
		
//		public boolean test(int num)
//		{
//			if(num>60)
//					return true;
//			else 
//				return false;
//		}

		//Predicate in a function. Predicate Chaining or Predicate Joining
		int[] ar= {1,2,3,4,5,6};
		Predicate<Integer> p1 = no -> no%2==0;
		Predicate<Integer> p2 =no->no<5;
		//check(p1,ar);
		
		// && || !
		//negate !
		//or
		//and
		
		//check(p1.negate(),ar);
		//check(p1.and(p2),ar);
		check(p1.or(p2),ar);
		
	}
	
	public static void check(Predicate<Integer> p1, int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
	    boolean result =  p1.test(ar[i]);
	    if(result)
	    	System.out.println(ar[i]);
		}
	}
}
