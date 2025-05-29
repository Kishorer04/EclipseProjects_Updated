package Revision;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		String value = sc.nextLine();
		
		char[] charArray = value.toCharArray();
		
		for(char c : charArray)
		{
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
			  map.put(c, 1);
				
		}
		
		System.out.println(map);

	}

}
