//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.openqa.selenium.JavascriptExecutor;
//
//class SubArraywithSum
//{
//    //Function to find a continuous sub-array which adds up to a given number.
//    static List<Integer> subarraySum(int[] arr, int n, int s) 
//    {
//       int t=0;
//        for(int i=0;i<n;i++)
//      {
//        t=arr[i];
//        if(s==t) 
//        return Arrays.asList(i+1);
//        
//        else
//        {
//        for(int j=i+1;j<n;j++)
//         {
//        	t=t+arr[j];
//            if(s==t)
//            return Arrays.asList(i+1,j+1);
//         }
//      }
//      }
//      System.out.println("No subarray found");
//      int i1=-1;
//      return Arrays.asList(i1+1);
//        
//    }
//    
//    
//    public static void main(String[] args) {
//		int[] arr= {6,2,1,5,3};
//		int size=arr.length;
//		int target=17;
//		 List<Integer> ans=subarraySum(arr,size,target);
//		 System.out.println(ans);
//		 
//		
//	
//	}
//}
package Common_Package;

import java.util.*;

public class SubArraywithSum {
	public static List<Integer>
	findSubarrayWithGivenSum(List<Integer> arr, int sum)
	{
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> subarray = new ArrayList<>();
		int currSum = 0;
		for (int i = 0; i < arr.size(); i++) {
			currSum += arr.get(i);
			if (map.containsKey(currSum - sum)) {
				subarray = arr.subList(
					map.get(currSum - sum) + 1, i + 1);
				break;
			}
			map.put(currSum, i);
		}
		return subarray;
	}

	public static void main(String[] args)
	{
		List<Integer> arr
			= Arrays.asList(15, 2, 4, 8, 9, 5, 10, 23);
		List<Integer> subarray
			= findSubarrayWithGivenSum(arr, 23);
		if (subarray.isEmpty()) {
			System.out.println(
				"No subarray with given sum found");
		}
		else {
			System.out.print("Subarray: [ ");
			for (int i : subarray) {
				System.out.print(i + " ");
			}
			System.out.println("]");
		}
	}
}
