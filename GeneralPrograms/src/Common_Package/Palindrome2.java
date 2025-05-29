package Common_Package;
import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str= sc.nextLine();
		String result="";
		
		for(int i=str.length();i>=1;i--)
		{
			result=result+str.charAt(i-1);
		}
		System.out.println(result);
		
	}

}
