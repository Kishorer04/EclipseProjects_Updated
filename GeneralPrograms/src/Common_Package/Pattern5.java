package Common_Package;
import java.util.Scanner;

public class Pattern5 {
	
	public  void patt(int n) {
		int num=1;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(num+" ");
				num=num+1;
			}
			System.out.println();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of rows");
		int x=sc.nextInt();
		Pattern5 pt = new Pattern5();
	    pt.patt(x);
		
	}

}
