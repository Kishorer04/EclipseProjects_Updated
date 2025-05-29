package Collections;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet<Integer> hs1=new HashSet<Integer>();
		
		hs1.add(2);
		hs1.add(4);
		hs1.add(6);
		hs1.add(8);
		
		
		HashSet<Integer> num=new HashSet<Integer>();
		num.addAll(hs1);
		System.out.println(num);
		
		//removeAll()
		num.removeAll(hs1);
		System.out.println(num);
		
		//sorting, shuffling not possible in set
		
		
		
		
		
	}

}
