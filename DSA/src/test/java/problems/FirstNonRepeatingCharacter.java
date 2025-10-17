package problems;

import java.util.*;

public class FirstNonRepeatingCharacter {
	
	//26 lowercase English letters (a to z).
    private static final int MAX_CHAR = 26;  

    public static int nonRep(String s) {
        int[] freq = new int[MAX_CHAR];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Find the first character with frequency 1
      for(int i =0;i<s.length();i++)
      {
    	if(freq[s.charAt(i)-'a']==1) 
    		return i; //return the position in the string
      }
      
      return -1;
   
    }

    public static void main(String[] args) {
        String s = "racecar";
        System.out.println("Index is: "+nonRep(s));
    }
}
