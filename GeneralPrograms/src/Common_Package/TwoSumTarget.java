package Common_Package;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumTarget {
	
	
	public static int[] twoSumTarget(int[] arr, int target) {
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			int extra = target-arr[i];
			
			if(map.containsKey(extra)) {
				return new int[] {map.get(extra),i};
			}
			
			map.put(arr[i], i);
		}
		
		return null;
	}
	

	public static void main(String[] args) {
		
		int[] arr = {2,5,4,7};
		int target = 9;
		int[] result = twoSumTarget(arr, target);
         System.out.println(Arrays.toString(result));
	}
}
