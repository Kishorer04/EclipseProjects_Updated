package Common_Package;
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		int n;
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		int i=0;
		int j = 0;
		
		
		for(i=0;i<=n;i++) {
			for(j=0;j<i;j++) {
				System.out.print("*");
				System.out.println("values of i and j "+i+" "+j);
			}
		
			System.out.println();
		}
		System.out.println("value of i and j outside loop "+i+" "+j);

	}

}
