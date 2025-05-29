package Common_Package;
import java.util.Scanner;

public class PrintPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of prime numbers");
		int n=sc.nextInt();
		boolean flag=true;
		System.out.println("1");
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=2;j<i;j++) {
				if(i%j==0)
					break;
			}
			
			if(i==j)
				System.out.println(i);
			
		}
			
	}
	}
	