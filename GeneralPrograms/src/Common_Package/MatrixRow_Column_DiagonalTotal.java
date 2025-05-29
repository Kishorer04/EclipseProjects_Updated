package Common_Package;

import java.util.Arrays;

public class MatrixRow_Column_DiagonalTotal {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];

		int val = 1;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				arr[i][j] = val;
				val++;
			}
		}

		// Print the row total

		for (int i = 0; i < 3; i++) {
			int total = 0;
			for (int j = 0; j < 3; j++) {
				total = total + arr[i][j];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("Row total " + total);
			System.out.println();
		}
		
		
		//Print column total
		
		for(int i=0;i<3;i++)
		{
			int total = 0;
			for(int j=0;j<3;j++)
			{
				total = total + arr[j][i];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("Column total "+total);
			System.out.println();
		}
		
		
		

		// Print the diagonal total
        int total =0;
		int i = 0;
		while (i < 3) {
			int j = 0;
			while (j < 3) {
				if (i == j) {
					total = total + arr[i][j];
				}
				System.out.print(arr[i][j]+ " ");
				j++;
			}

			System.out.println();
			i++;
		}
		System.out.println("Diagonal total " + total);

	}

}
