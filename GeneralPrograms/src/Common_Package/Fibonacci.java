package Common_Package;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		int f=0,s=1,t,n;
		System.out.println("Enter the number of elements");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		int i=0;
		while(i<n)
		{		
		System.out.print(f+" ");
		t=f+s;
		f=s;
		s=t;
		i++;
		}
		
		
	}

}
