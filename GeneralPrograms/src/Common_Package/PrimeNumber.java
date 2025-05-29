package Common_Package;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int n;
		
		System.out.println("Enter n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int flag = 0;
			for (int j = 1; j <=i; j++) {

				if (i % j == 0) {
					flag++;
					
				}

				
			}
			if (flag == 2)
				System.out.println(i);

		}

	}
}