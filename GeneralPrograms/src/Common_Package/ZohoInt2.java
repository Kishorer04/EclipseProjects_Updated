package Common_Package;

public class ZohoInt2 {

	public static void main(String[] args) {
		// Given an array of size n. A value for x, y are given.
		// Print the element in the array only if 
		//1. the x value is less than y and also, 
		//2. the value is inbetween the given x and y values.
		
		//Eg. TC 1:  x=4, y=10 arr ={4,3,7,11,50,1}  Expected output = 7
		//Eg. TC 2:  x=10, y=14 arr={4,3,7,11,50,1} Expected output = 11

		
		int arr[] = {4,3,7,11,50,1};
		
		int x=10,y=14;
		
		if(x<y)
		{	
			
			for(int i=0;i<arr.length;i++) {
				
				if(arr[i]>x && arr[i]<y) {
				System.out.println(arr[i]);
				}
				
	    	}

		}
		else
			System.out.println("Condition mismatch");
		
				
		
	}

}
