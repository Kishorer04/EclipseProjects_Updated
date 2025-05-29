package Common_Package;
import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		
		int[] ar=new int[5];
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println("enter the array elements");
			 ar[i]=sc.nextInt();
		}
		
		System.out.println("Enter the element to be searched");
		int key=sc.nextInt();
		
        int i=0;
        
        while(i<ar.length)
        {
        	if(key==ar[i])
        	{
        	flag=true;
        	System.out.println("Postion of key is "+(i+1));
        	}
        	i++; 
        }
        System.out.println("Value of i is "+i);
        
        if(flag==false) {
        	System.out.println("Element is not present in array");
        }
        
       
        
}

}