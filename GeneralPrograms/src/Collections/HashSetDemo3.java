package Collections;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		//Union, Intersection, Difference
		
		HashSet<Integer> set1=new HashSet<Integer>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		HashSet<Integer>set2=new HashSet<Integer>();
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		//union
//		set1.addAll(set2);
//		System.out.println("Union"+set1);    //Duplicates not allowed only unique elements
		
		//intersection
		set1.retainAll(set2);
		System.out.println("Intersetion"+set1);
		
		//Difference between 2 sets
		
		set1.removeAll(set2);
		System.out.println("Difference"+set1);
		
		//Subset-containsAll()
		System.out.println(set1.containsAll(set2));
		
		
	}

}
