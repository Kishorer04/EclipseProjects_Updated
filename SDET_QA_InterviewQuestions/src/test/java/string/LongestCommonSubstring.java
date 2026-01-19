package string;

import java.util.Arrays;

public class LongestCommonSubstring {

    // Function to find the length of the longest LCS 
    // with space optimization
    public static int longestCommonSubstr(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Create a 1D array to store the previous row's results
        int[] prev = new int[n + 1];
        
        int res = 0;
        for (int i = 1; i <= m; i++) {
          
            // Create a temporary array to store the current row
            int[] curr = new int[n + 1];
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    curr[j] = prev[j - 1] + 1;
                    res = Math.max(res, curr[j]);
                } else {
                    curr[j] = 0;
                }
            }
          
            // Move the current row's data to the previous row
            prev = curr;
//            System.out.println(Arrays.toString(prev));
        }
        return res;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "zab";
        System.out.println(longestCommonSubstr(s1, s2));
    }
}