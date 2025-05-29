package Common_Package;

public class OccurenceOfString {

	
	 static int Occurence(String s, String n) {		 
		 
		 for(int i=0;i<=s.length()-n.length();i++) {
			 if(s.substring(i, i+n.length()).equals(n))
			 {	 
			 return i;
			 }
		 }
		return -1;
	 }
	
	
	public static void main(String[] args) {
		String s="HelloMamHiMam";
		String n="Mam";
		int result=Occurence(s,n);
		System.out.println(result);
		
	}

}
