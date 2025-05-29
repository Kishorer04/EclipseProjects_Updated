package ArraysClassandComparator;

import java.util.Arrays;

public class EqualsMethodDemo {

	public static void main(String[] args) {

		int[] a1 = { 5, 4, 7, 5 };
		int[] a2 = { 5, 4, 7, 5 };

		System.out.println(Arrays.equals(a1,a2));
		
//		Won't work
//		System.out.println(a1==a2);
//		System.out.println(a1.equals(a2));
		
		

		/*
		 * //Equals method logic may ask in interviews
		 * 
		 * boolean same = true; for(int i=0;i<a1.length;i++) {
		 * 
		 * if(a1[i]!=a2[i]) { same=false; System.out.println("Arrays are not same");
		 * break; }
		 * 
		 * 
		 * } if(same == true) System.out.println("Arrays are same");
		 */  
		
		
	
		
		 
	}

}
