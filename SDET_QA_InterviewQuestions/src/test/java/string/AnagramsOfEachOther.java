package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class AnagramsOfEachOther {
    
    static boolean areAnagrams(String s1, String s2) {
        
        if(s1.length() != s2.length()){
            return false;
        }
        
        // create a hashmap to store 
        // character frequencies
        HashMap<Character, Integer> charCount =
                                    new HashMap<>();
        
        // count frequency of each
        // character in string s1
        for (char ch : s1.toCharArray()) 
            charCount.put(ch,
                    charCount.getOrDefault(ch, 0) + 1);
        
//        System.out.println(charCount);
  
        // count frequency of each
        // character in string s2
        for (char ch : s2.toCharArray()) 
            charCount.put(ch,
                    charCount.getOrDefault(ch, 0) - 1);
        
//        System.out.println(charCount);
  
        // check if all frequencies are zero
        for (Entry<Character, Integer> pair : charCount.entrySet()) {
            if (pair.getValue() != 0) {
                return false;
            }
        }
        
       
        return true;
    }

    public static void main(String[] args) {
        
        String s1 = "geeks";
        String s2 = "kseeg";
        System.out.println(areAnagrams(s1, s2) ? "true" : "false");
        
    }
}

