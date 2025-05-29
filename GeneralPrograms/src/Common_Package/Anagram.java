package Common_Package;

import java.util.Arrays;

public class Anagram {
	
	
	public static String checkAnagram(String text1, String text2){
		
		char[] ch =text1.toCharArray();
		char[] ch2= text2.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch, ch2))
			return "They are anagram";
		else
			return "Not anagram";
		
	}

	public static void main(String[] args) {
		
		String text1 = "silent";
		String text2 = "listen";
		
		String result =checkAnagram(text1,text2);
        System.out.println(result);
	}

}
