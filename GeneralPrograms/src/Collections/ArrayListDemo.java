package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//1.List is growable in nature
		//2.Allows duplicate elements
		//3.Insertion order is preserved
		
		
		//Different ways to create ArrayList
		ArrayList al=new ArrayList(); //Initial size of ArrayList is 10
//		List al= new ArrayList();
		//ArrayList<Integer> al =new ArrayList<Integer>();    //ArrayList for particular datatype
//		List<String> al=new ArrayList<String>();            //ArrayList for particular datatype
		
		
		//add() adding new elements to the arraylist
		al.add("Kishore");
		al.add(33);
		al.add(false);
		System.out.println(al);
		
		//add() with index
		al.add(2, "Vignesh");
		System.out.println(al);
	
		
		//clear()
		//System.out.println(al.clear());

		
		//get() Retrieve data
		System.out.println(al.get(1));
		
		//set()  Change element/replace
		al.set(3, "Raju");
		System.out.println(al);
		
		//size()
		System.out.println(al.size());
		
		//contains() search- Returns True/False
		System.out.println(al.contains("Vignesh"));
		
		//isEmpty();- Returns True/False
		System.out.println(al.isEmpty());
		
		System.out.println("Reading elements using for loop");
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("Reading elements using for-each loop");
		
		for(Object a:al) {
			System.out.println(a);
		}
		
		
		//Reading elements using Iterator
		System.out.println("Reading elements using Iterator");
		
		Iterator it=al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());//Printing the element and moving to next
		}
		
		
	//remove()
	System.out.println("Removed element "+al.remove(0));
		

	}

}
