package Common_Package;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		
		HashMap<Character,Integer> m=new HashMap<Character,Integer>();
		System.out.println("Enter string");
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		char[] ch=s.toCharArray();
		
		//Print the char array
		for(char c:ch)
			System.out.println(c);
		
//		for(char c:ch) 
//		{
//			if(m.containsKey(c))
//			m.put(c, m.get(c)+1);
//			
//			else
//			m.put(c, 1);
//
//		}
//		System.out.println(m);
		
		for(int i=0;i<ch.length;i++)
		{
			if(m.containsKey(ch[i]))
				m.put(ch[i], m.get(ch[i])+1);
			else
				m.put(ch[i],1);
		}
		System.out.println(m);
	
		
	}

}
