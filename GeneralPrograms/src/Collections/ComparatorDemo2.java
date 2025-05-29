package Collections;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo2 implements Comparator {
	int price=0;
	int ram=0;
	String processor="";

	public ComparatorDemo2(int price, int ram, String processor) {
		this.price=price;
		this.ram=ram;
		this.processor=processor;
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		
		int price1=(int)o1;
		int price2=(int)o2;
		
		if(price1 > price2) {
			return -1;
		}
		else if(price1 < price2) {
			return 1;
		}
		else
		return 0;
	}

	public static void main(String[] args) {
		
		ComparatorDemo2 oppo=new ComparatorDemo2(20000,32,"snapdragon");
		ComparatorDemo2 vivo=new ComparatorDemo2(30000,64,"qualcomm");
		ComparatorDemo2 realme=new ComparatorDemo2(40000,128,"iris");
		
		ComparatorDemo2[] m= {oppo,vivo,realme};
		Arrays.sort(m);
     
		for(ComparatorDemo2 re:m)
         System.out.println(re);	
		

	}




}
