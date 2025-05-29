package Common_Package;
import java.util.Scanner;

public class ReverseString {
	public static void main(String args[]) {
		String str,rstr="";
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		
		
	for(int i=0;i<str.length();i++) {
	
		rstr=  str.charAt(i)+rstr;
	}
	System.out.println(rstr);

}}
