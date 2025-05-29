package Common_Package;

public class FirstLastOccurence {

	public static void findFirstLast(int[] arr, int target) {
		int first = -1;
		int last = -1;
	
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==target)
			{
				if(first == -1)
				first = i;
			 last = i;
			}
		}
		
		if(first != -1)
		{
	    System.out.println("First Occurence "+ first);
		System.out.println("Last Occurence "+ last);
		}
		
		else
		System.out.println("Number not present in the array");
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {3,5,6,3,9,6,5};
		int target = 5;
	
		findFirstLast(arr,target);

		
	}

}
