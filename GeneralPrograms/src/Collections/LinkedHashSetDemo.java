package Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//Duplicates not allowed
		//Insertion order is preserved
		
//Default capacity or initial size of LinkedHashSet is 16 and it can be modified like HashSet
//Default LoadFactor/Fill Ratio is 0.75 percent and it can be modified like HashSet

		//LinkedHashSet<Integer> lhs =new LinkedHashSet<Integer>();
		LinkedHashSet lhs= new LinkedHashSet();
		
		lhs.add("Kishore");
		lhs.add(5);
		lhs.add(false);
		lhs.add("drive");
		lhs.add(8);
		
		System.out.println(lhs);
		
		//All HashSet methods are applicable to LinkedHashSet also
	}

}
