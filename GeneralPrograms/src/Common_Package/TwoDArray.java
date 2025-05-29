package Common_Package;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows of mat 1");
		int m=sc.nextInt();
		System.out.println("Enter col of mat 1");
		int n=sc.nextInt();
		
		
		int[][] mat1=new int[m][n];
		
		//Input of 1st matrix
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("enter value of mat"+i+j);
				mat1[i][j]=sc.nextInt();
			}
		}

		//Output of 1st matrix
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++) {
				System.out.print(mat1[i][j]+"\t");
			}
			System.out.println();	
		}

	////////////////////////////////////////////////////////////
		System.out.println("Enter 2nd matrix no. of rows");
		int p=sc.nextInt();
		System.out.println("Enter 2nd matrix no. of cols");
		int q=sc.nextInt();
		
		
		if(n==p)
			System.out.println("Matrix multiplication possible");
		else {
			System.out.println("Matrix multiplication not possible......Terminating program");
			System.exit(0);
		}
			
		
		
		int[][] mat2=new int[p][q];
		
		//Input of 2nd matrix
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++)
			{
				System.out.println("enter mat2 "+i+j);
				mat2[i][j]=sc.nextInt();
			}
		}
		
		
		//Output of 2nd matrix
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++) {
				System.out.print(mat2[i][j]+"\t");
			}
			System.out.println();
		}
		
//////////////////////////Matrix Multiplication///////////////////////3*2////m=3,n=3////p=3,q=2////
//System.out.println("Resultant matrix");
//int[][]mat3=new int[m][q];
//		
//for(int i=0;i<m;i++) {
//	for(int j=0;j<q;j++) 
//	{
//	//mat3[i][j]=0;
//	//System.out.println("mat3 value"+mat3[i][j]);
//	 for(int k=0;k<n;k++)
//	 {
//		mat3[i][j]=mat3[i][j]+mat1[i][k]*mat2[k][j];
//	 }
//	}                                                             //38 32 101 86 164 140
//}
//		

System.out.println("Resultant matrix");
int[][]mat3=new int[m][q];


for(int i=0;i<m;i++) {
	for(int j=0;j<q;j++)
	{
		int sum = 0;
		for(int k=0;k<p;k++)
		{
			sum=sum+mat1[i][k]*mat2[k][j];
		}
		mat3[i][j]=sum;
		
	}
	
}


		
///Output of mat3

for(int i=0;i<m;i++) {
	for(int j=0;j<q;j++) {
		System.out.print(mat3[i][j]+"\t");
	}
	System.out.println();
}
		

	}

}
