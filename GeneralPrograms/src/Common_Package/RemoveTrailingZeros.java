package Common_Package;

import java.util.Arrays;

public class RemoveTrailingZeros {
	
	
	
	
	public static int[] removeZeros(int[] arr)
	{
		int lastNonZeroIndex = -1;
		
		for(int i = arr.length-1;i>=0;i--)
		{
			if(arr[i]!=0)
			{
				lastNonZeroIndex = i;
			    break;
			}
		}
		
		if(lastNonZeroIndex==-1)
		 return new int[0];
		
		return Arrays.copyOfRange(arr, 0, lastNonZeroIndex+1);
		
	}
	
	

	public static void main(String[] args) {
		int[] arr = {1,3,4,2,8,0,0,0,0};
       int[] result = removeZeros(arr);
    
       System.out.println(Arrays.toString(result));
   
	}

}
