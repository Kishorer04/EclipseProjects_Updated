package Collections;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorInterface {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		l.add("Kishore");
		l.add(0);
		l.add(null);
		//System.out.println(l);
		
		Iterator v=l.iterator();
		
		for(int i=0;i<3;i++)
		{
		Object value=v.next();
		System.out.println("First next "+value);
		if(i==2)
		{
		  v.remove();
		System.out.println("Remove "+value);
		}
		}
		
		
	;
		
	
		
		
		
		

	}

}
