package Comparator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MobileComparator {
	
	String model;
	int price;
	int storage;
	
	MobileComparator(String model, int price, int storage){
		this.model = model;
		this.price = price;
		this.storage = storage;
	}
	
	public String toString() {
		return "Model:" + model + " Price:" + price + " Storage:" + storage;
	}

	public static void main(String[] args) {
		
		Comparator comp = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				 MobileComparator o11 =(MobileComparator)o1;
				 MobileComparator o22 =(MobileComparator)o2;
				 
				if(o11.price<o22.price) 
					return 1;
				else if(o11.price>o22.price)
					return -1;
				else
					return 0;
			}		
		};
		
		List<MobileComparator> l = new ArrayList<MobileComparator>();
		
		l.add(new MobileComparator("Oppo", 12000,8));
		l.add(new MobileComparator("Vivo", 15000, 12));
		l.add(new MobileComparator("Apple", 30000, 18));
		l.add(new MobileComparator("Redmi",20000,20));
		
		Collections.sort(l,comp);
		
		for(MobileComparator m : l)
			System.out.println(m);

	}
}
