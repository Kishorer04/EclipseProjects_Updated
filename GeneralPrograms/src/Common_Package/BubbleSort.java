package Common_Package;
import java.util.Scanner;

public class BubbleSort {
	
public static void main(String[] args) {
	System.out.println("enter size of array");
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int[] ar=new int[size];
	for(int i=0;i<size;i++) {
		System.out.print("Enter array elements");
		ar[i]=sc.nextInt();
	}
    System.out.println("Befor sorting");
    

	for(int x=0;x<ar.length;x++)
	System.out.print(" "+ar[x]);
	
	
	int j=1;
	while(j<ar.length)
	{
		int i=0;
		while(i<ar.length-j)
		{
			if(ar[i]>ar[i+1])
			{
			int temp=ar[i];
			ar[i]=ar[i+1];
			ar[i+1]=temp;
			}
			i++;
		}
		j++;
				
	}
	System.out.println();
	System.out.println("After sorting");
	
	for(int k=0;k<ar.length;k++) {
	System.out.print(" "+ar[k]);
	}
	
	
}
}
