package Common_Package;
import java.util.Scanner;

public class Pattern6 {
	
	public void patt(int n) {
	
		for(int i=0;i<n;i++) {
			int num=1;
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
		Pattern6 pt = new Pattern6();
	    pt.patt(x);
		
	}

}
