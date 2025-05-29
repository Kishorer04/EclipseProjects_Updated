package Common_Package;
import java.util.Scanner;

public class NumToWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		int a=num%10;
		int a1=num/10;
		int a2=a1%10;
		int a3=a1/10;
		int a4=a3%10;
		int a5=a3/10;
		
		
		String[] s =new String[] {" ","one","two","three","four","five","six","seven","eight",
				"nine","ten","eleven","twelve","thirteen","fourteen","fifteen",
				"sixteen","seventeen","eighteen","nineteen"};
		
		String s1[]= {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		
		String s2[]={"hundered","thousand"};
		
	
		
		
		if(num<20)
			System.out.println(s[num]);
		
		else if(num<100)
			System.out.println(s1[a2]+" "+s[a]);
		
		else if(num<1000)
			System.out.println(s[a4]+" "+s2[0]+" "+s1[a2]+" "+s[a]);
		
		else if(num<10000)
			System.out.println(s[a5]+" "+s2[1]+" "+s[a4]+" "+s2[0]+" "+s1[a2]+" "+s[a]);
		
		else
			System.out.println("Invalid");
	}

}
