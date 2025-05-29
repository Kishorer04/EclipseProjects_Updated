package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
	String[] arr= {"Kishore","Vignesh","Raghu"};
	
	for(String a:arr)
		System.out.println(a);
	
	
	//Converting array into ArrayList
	ArrayList al =new ArrayList(Arrays.asList(arr));
	System.out.println("Printing as list "+al);
	
    //or
	List al1=Arrays.asList(arr);
	System.out.println(al1);
	}

}
