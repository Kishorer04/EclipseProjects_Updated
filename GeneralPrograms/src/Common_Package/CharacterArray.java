package Common_Package;
import java.util.Arrays;

public class CharacterArray {

	
	public static void main(String[] args) {
		String s="Kishore Kumar";
		
		char[] c= s.toCharArray();
		
		for(char cc:c)
	System.out.print(cc+" ");
		
		
		char[] charArray1 = {'a', 'b', 'c', 'd', 'e'}; 
		char[] charArray2 = {'a', 'b', 'c', 'd', 'e'}; 
		
		System.out.println(charArray1.hashCode());
		
		System.out.println(charArray2.hashCode());
		
		
		
		/*
		 * if(Arrays.equals(charArray1, charArray2)) { System.out.println(true); } else
		 * System.out.println(false);
		 */
		
		
	}
}
