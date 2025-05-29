package Common_Package;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ReverseAString {

//	public static void main(String[] args) {
//		String word="ABCD";
//		String word2="";
//		
//		for(int i=word.length()-1;i>=0;i--)
//			word2=word2+word.charAt(i);
//		
//		System.out.println(word2);
//		
//		if(word2.equals(word))
//			System.out.println("Palindrom");
//		else
//			System.out.println("Not palindrome");
//
//	}
	
	
	public static void main(String[] args) {
		String s="ABCD";
		String rs="";
		
		for(int i=0;i<s.length();i++) {
			rs=s.charAt(i)+rs;
		}
		System.out.println(rs);
	}

}
