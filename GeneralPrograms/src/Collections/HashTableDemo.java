package Collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
	//Hashtable t= new Hashtable();  //default capacity is 11 loadfactor is 0.75
	                               //Uses Hashtable datastructure and uses Hashcode concept. All the collections using Hashtable datastructure and HashCode technology their:
	                               //1.insertion order will not be preserved and will have load factor
	
	//Hashtable tt= new Hashtable(initial capacity, fill ratio/load factor); - Creating hashtable with different capacity and load factor
     
	Hashtable <Integer,String> t= new Hashtable<Integer,String>();
	
	t.put(101, "John");
	t.put(102, "David");
	t.put(103, "Bob");
	t.put(104, "Shawn");
	//t.put(null, "Mathew");  // in HashMap we can have one null key and many null values,whereas in HashTable both are not possible
	//t.put(104, null);
	System.out.println(t);
	
	//getvalue 
	System.out.println(t.get(102));
	
	//remove the value
	System.out.println(t.remove(103));
	
	//containsKey()
	System.out.println(t.containsKey(101));
	
	//containsValue()
	System.out.println(t.containsValue("Bob"));
	
	//isEmpty()
	System.out.println(t.isEmpty());
	
	//returns all keys from the Hashtable
	System.out.println(t.keySet()); //return type is Set
	
	//returns all values
	System.out.println(t.values());  //return type is Collection
	
	
	//using for-each
	
	for(int k:t.keySet())
		System.out.println(k+" "+t.get(k));
	
	
	//using Entry interface
	
	//entrySet()
	
	//for-each
	                                     
	for(Map.Entry entry:t.entrySet())      //a key and a value pair is 1 entry
	System.out.println(entry.getKey()+" "+entry.getValue());
	
	
	//using iterator interface
	
	Set s=t.entrySet();  //Set bcoz duplicates are not allowed
	Iterator itr=s.iterator();
	
	
	while(itr.hasNext())
	{
	   Map.Entry entry= (Entry) itr.next();
	   System.out.println(entry.getKey()+" "+entry.getValue());
	}
	
		
	
	
	}

}
