package Common_Package;
import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=5;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int k=0;k<=i;k++) 
			{
				System.out.print(" ");
			}
		}

	}

}
