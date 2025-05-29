package Common_Package;

import java.util.Arrays;
import java.util.Scanner;



public class Matrix_2DArray {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter size of the array");
    System.out.println("Enter row size");
    int row = sc.nextInt();
    System.out.println("Enter col size");
    int col = sc.nextInt();
    
    int[][] arr = new int[row][col];
    
    System.out.println("Enter array elements");
    
    int i =0;
    while(i<row)
    {
    	int j =0;
    	while(j<col)
    	{			
    		arr[i][j] = sc.nextInt();
    		j++;
    	}
    	i++;
    }
    
    System.out.println("Printing the array");
    
   // System.out.println(Arrays.deepToString(arr));
    
    int ii =0;
    while(ii<row)
    {
    	int j=0;
    	while(j<col)
    	{
    		System.out.print(arr[ii][j]+" ");
    		j++;
    	}
    	System.out.println();
    	ii++;
    }

	}

}
