package com.galaxe.training;

import java.util.ArrayList;  
import java.util.Collections;
 
public class SortArray {  
public static void main(String[] args) {  
 
//String arr[] = {"abi","suresh","Kabil"};  

//System.out.println("Array:"+arr);  

ArrayList<String> arrayList = new ArrayList<String>();  
arrayList.add("Arun");
arrayList.add("zyan");
arrayList.add("george");
arrayList.add("daniel");
Collections.sort(arrayList);
System.out.println("Array after sorting: "+arrayList);  
  
}  
}  

