package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// HashMap m=new HashMap();   //default capacity is 16, load factor is 0.75
		// In HashMap duplicate keys are not allowed, but duplicate values are allowed.
		
		//Uses Hashtable datastructure and so uses HashCode concept. All the collections using Hashtable datastructure
		//and HashCode technology their:
        //1.insertion order will not be preserved and will have load factor
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		//HashMap m= new HashMap(initial capacity, fill ratio/load factor); - Creating HashMap with different capacity and load factor
		
		// inserting elements
		m.put(101, "Java");
		m.put(102, "Python");
		m.put(103, "Ruby");
		m.put(104, "GoLang");
		m.put(-4, "88");
		
		  System.out.println(m);
		  
		/*
		 
		 //retrive value by passing key 
		  System.out.println(m.get(103));
		  
		  //remove pair from hashmap 
		  System.out.println(m.remove(101));
		 
		  //containsKey 
		  System.out.println(m.containsKey(101));
		  
		  //containsValue 
		  System.out.println(m.containsValue("Python"));
		  
		
		 //isEmpty 
		 System.out.println(m.isEmpty());
		 
		  //Retreiving only keys
		  System.out.println(m.keySet()); //return all keys as set
		 
		  
		  //printing using for-each loop
		   for(Object i:m.keySet())
		  System.out.println("Key set for-each "+i);
		  
		  //Retreiving only values
		   System.out.println(m.values()); //returns all values as Collection
		  
		  
		  //printing using for-each loop 
		  for(Object i:m.values())
		  System.out.println("values for-each "+i);
		  
		  	  
		 //printing key and value using for-each 
		  for(Object i:m.keySet())
		  System.out.println(i+"  "+m.get(i));
		  
		  //****************************************** 
		  
		  //Using methods of Entry interface. Entry is a sub-interface of Map interface
		 
		  
		  //Retreiving entries(1key,1value is a entry)
		 
		  System.out.println(m.entrySet()); //returns all entries as set
		  
		 
		// printing using for-each
		for (Map.Entry i : m.entrySet()) // getting 1 entry so type is Map.Entry
			System.out.println(i.getKey() + "  " + i.getValue());

		// using iterator method
		Set var = m.entrySet();
		Iterator it = var.iterator();

		while(it.hasNext())
			System.out.println("Iterator "+it.next());

		while (it.hasNext()) {
			Map.Entry ent = (Entry) it.next();
			System.out.println(ent.getKey() + "  " + ent.getValue());
		}
		
		*/

	}


}
