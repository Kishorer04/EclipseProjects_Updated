package Common_Package;

public class NumOfWords {

	public static void main(String[] args) {
		String s="Welcome the";
		
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
			
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
				count++;
		}
		
		System.out.println("Total words "+ count);
		
	}

}
