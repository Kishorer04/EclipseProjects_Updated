package com.galaxe.training;

import java.util.ArrayList;  
import java.util.Arrays;
public class AddArray {  
public static void main(String[] args) {  
 
 Integer arr[] = {1,2,3,4,5,6};  
Integer a[];
System.out.println("Array:"+Arrays.toString(arr));  

ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));  
//arrayList.remove(3);  
//arrayList.add(2,9); 
if(arrayList.contains(9)) {
	System.out.println("is found");
}
else {
	System.out.println("not found");
}
a = arrayList.toArray(arr);  
System.out.println("Array after adding element: "+Arrays.toString(a));  
  
}  
}  

