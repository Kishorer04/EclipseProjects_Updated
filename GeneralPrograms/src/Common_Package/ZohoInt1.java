package Common_Package;

public class ZohoInt1 {

	public static void main(String[] args) {
		// Given an unsorted array. Write a program to find continuous pair largest sum value
		
		int arr[]= {5,0,4,6,3,9};
		
		int bigValue=0;
	    int sum=0;	
	    
		for (int i=0; i<arr.length-1;i++) {
			
			sum=arr[i]+arr[i+1];
		    
			if(sum>bigValue)
			 bigValue=sum;	
		}
		System.out.println("The largest sum value is " + bigValue);
	

	}

}
