package Common_Package;
import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		int n;
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		int i;
		for(i=0;i<=n;i++) {
			for(int j=5;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("value of i "+i);
	}

}
