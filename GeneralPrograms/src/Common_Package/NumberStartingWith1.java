package Common_Package;

import java.util.ArrayList;
import java.util.List;

public class NumberStartingWith1 {
	
	public static int getFirstDigit(int num) {
		
		while(num>=10)
		{
		num = num/10;
		}
		return num;
		
	}
	
	public static List<Integer> getNumbers(int arr[]) {
		
	   List<Integer> list = new ArrayList<Integer>();
	   
	   for(int a:arr)
	   {
		  int n = getFirstDigit(a);
		  if(n == 1)
		  {
		  list.add(a);	
		  }
	   }
	   
	   return list;
	
	}

	public static void main(String[] args) {
		
		int[] arr = {1,43,190,1165,16};
		List<Integer> result =getNumbers(arr);
		System.out.println(result);
	}
}
