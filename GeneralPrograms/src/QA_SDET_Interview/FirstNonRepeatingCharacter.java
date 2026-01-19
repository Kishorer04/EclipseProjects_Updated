package QA_SDET_Interview;

import java.util.*;

public class FirstNonRepeatingCharacter {
    private static final int MAX_CHAR = 26;  

    public static char nonRep(String s) {
        int[] freq = new int[MAX_CHAR];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Find the first character with frequency 1
        for (char c : s.toCharArray()) {
            if (freq[c - 'a'] == 1) {
                return c;
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        String s = "aabbcc";
        System.out.println(nonRep(s));
    }
}
