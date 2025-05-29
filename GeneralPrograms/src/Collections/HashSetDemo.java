package Collections;


import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {

	public static void main(String[] args) {
		
//		Duplicates no allowed
//		Insertion order is not preserved

		HashSet hs=new HashSet();  //default capacity or initial size of HashSet is 16
	//Default LoadFactor/Fill Ratio is 0.75 percent
//		HashSet hs=new HashSet(100);
//		HashSet hs=new HastSet(100,(float)0.95); //LoadFactor/Fill Ratio 0.95
//		HashSet<Integer>hs=new HashSet<Integer>();
		
		 //Add objects/elements in HashSet
	     hs.add(0);
	     hs.add("Kishore");
	     hs.add(true);
	     hs.add(null);
	     System.out.println(hs); //Insertion order not preserved
		
		//remove
	     hs.remove(0); //value is given, index not accepted
	     System.out.println(hs);
	     
	     //get(),set() is not available in HashSet because HashSet is unordered
	     
	     //contains()
	    System.out.println(hs.contains("Kishore")); 
	    
	    //isEmpty()
	    System.out.println(hs.isEmpty());
	    
	    //reading elements from HashSet using for each loop
	    
//	    for(Object e:hs)
//	    	System.out.println(e);
	    
	    
	    //Iterator method
	    Iterator it=hs.iterator();
	  
	   while(it.hasNext())
		  System.out.println(it.next());
	
	}

}
