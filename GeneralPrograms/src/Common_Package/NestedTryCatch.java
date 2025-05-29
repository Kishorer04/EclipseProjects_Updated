package Common_Package;
import java.util.Scanner;



public class NestedTryCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		try {
			int b = 10 / a;
			System.out.println("Value of b is " + b);

			try {
				if (a == 1)
					a = a / (a - 1);

				if (a == 2) {

					int[] c = { 3, 4, 5 };
					c[5] = 456;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index out of Bound exception");
			}
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception occured");
		}

	}

}
