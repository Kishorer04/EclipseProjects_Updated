package Common_Package;
import java.util.Scanner;

public class ArmstrongNumber {

	
int armstrongNumber(int n) {
   int an=0;
   int pow=Integer.toString(n).length();
   
   for(int i=0;i<pow;i++) 
   {
   int m=n%10;
   n=n/10;
   an=(int) (an+Math.pow(m, pow));
   }
   
   return an;
   
}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArmstrongNumber armstrongnumber=new ArmstrongNumber();
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int result=armstrongnumber.armstrongNumber(n);
	    if(result==n)
	    	System.out.println(n+" Is a armstrong number");
	    else
	    	System.out.println(n+" Is not a armstrong number");
		
	}

}
