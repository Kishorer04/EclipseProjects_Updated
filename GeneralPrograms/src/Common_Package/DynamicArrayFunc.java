package Common_Package;
import java.util.Arrays;

//List implementation using Arrays
public class DynamicArrayFunc {
	private static final int initialcapacity=2;
	private int arr[];
	private int size;
	private int capacity;
	
	DynamicArrayFunc(){
		size=0;
		arr=new int[initialcapacity];
		capacity=initialcapacity;
	}
     
	public void add(int val) {
		if(size==capacity) 
		expandArray();
		arr[size++]=val;
	}
	
	public void display() {
		System.out.println("Elements in the list");
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
	}
	
	private void expandArray() {
		
		capacity*=2;
		arr=java.util.Arrays.copyOf(arr, capacity);
	}
	
	public void insert(int val,int pos) {
	  if(size==capacity) 
		  expandArray();
	  for(int i=size-1;i>=pos;i--)
		  arr[i+1]=arr[i];
	  
	  arr[pos]=val;
	  size++;
		
	}
	
	public void delete(int pos) {
		
		for(int i=pos+1;i<size;i++)
			arr[i-1]=arr[i];
		size--;
		
		if(capacity>initialcapacity && capacity==size*3)
			shrinkArray();				
			
		
	}
	
	private void shrinkArray() {
		capacity=initialcapacity;
		arr=java.util.Arrays.copyOf(arr, capacity);
	}
	
   public int length() {
	   return arr.length;
   }
   
   public int size() {
	   return size;
   }
   
   public void deleteAtLast() {
	  int pos=size-1;
	 arr=Arrays.copyOf(arr, pos);
	 size--;

   }

public int get(int pos) {
	return arr[pos];	
}

public void update(int pos, int val) {
   arr[pos]=val;
   System.out.println("Updated Successfully");
	
}
   
   
	
	
	

}
