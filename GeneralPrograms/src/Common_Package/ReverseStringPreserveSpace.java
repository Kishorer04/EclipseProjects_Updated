package Common_Package;

import java.util.Scanner;

// [Expected Approach] - Using two Pointers - O(n) Time and O(1) Space
/*
The idea is to use two pointers pointing at start and end of the string. If character at start or end is space, 
we move the pointer pointing to the space to the next position and swap only if both pointer point to a character. 
*/

public class ReverseStringPreserveSpace {
	
	public static String reverseStringPreserveSpace(String str) {
		
	   int n = str.length();
	   
	   //Initialize 2 pointers in 2 corners
	   int start = 0;
	   int end = n-1;
	   
	   char[] Str = str.toCharArray();
	   
	   //Move both pointers towards each other
	   while(start<end)
	   {
		   
		   if(Str[start]== ' ')
		   {
			   start++;
			   continue;
		   }
		   
		   else if(Str[end]==' ')
		   {
			   end--;
			   continue;
		   }
		   
		   // If both are not spaces do swap
		   
		   else {
			   char temp = Str[start];
			   Str[start] = Str[end];
			   Str[end] = temp;
			   start++;
			   end--;
		   }
	   }
	   
	   return String.valueOf(Str);
	   
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String result = reverseStringPreserveSpace(s);
		
		System.out.println(result);
		
	}

}
