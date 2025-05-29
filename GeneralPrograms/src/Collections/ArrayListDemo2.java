package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List al=new ArrayList();
		al.add("A");
		al.add("C");
		al.add("D");
		al.add("B");
		
		System.out.println("Index"+al.indexOf("D")+al.indexOf("C"));
		
		ArrayList al_dup=new ArrayList();
	
		
		//addAll()
		al_dup.addAll(al);
		System.out.println(al_dup);
		
		
		//removeAll()
		al_dup.removeAll(al);
		System.out.println(al_dup);
		
       
		//sort(),shuffle() is possible only with similar elements of similar datatype
		
		//sort()---> Collections.sort() *Collections is a Class*
		Collections.sort(al);
		System.out.println("Sort "+al);
		
		//sort()--->in reverse order
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Sort reverse "+al);
		
		//shuffle()
		Collections.shuffle(al);
		System.out.println("Shuffle "+al);
		
		
		
		
	}

}
