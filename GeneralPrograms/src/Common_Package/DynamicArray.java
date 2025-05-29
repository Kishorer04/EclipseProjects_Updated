package Common_Package;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		int val;
		int pos;
		Scanner sc=new Scanner(System.in);
		DynamicArrayFunc list=new DynamicArrayFunc();
		while(true) {
		System.out.println("\n*****MENU*****");
        System.out.println("1. Insert at the End\n");
        System.out.println("2. Display the list\n");
        System.out.println("3. Insert at Specified position\n");
        System.out.println("4. Delete at specified position\n");
        System.out.println("5. Exit\n");
        System.out.println("6. Length of the array\n");
        System.out.println("7. Size of array(no. of elements in the list)\n");
        System.out.println("8. Delete at the end\n");
        System.out.println("9. Enter pos to get the value\n");
        System.out.println("10. Update the value");
        System.out.println("-----------------");
        System.out.println("Enter your choice");
       
      int choice=sc.nextInt();
        
        switch(choice) {
        
        case 1: System.out.println("Enter a value to insert at the end");
                val=sc.nextInt();
                list.add(val);
                break;
                
                
        
        case 2: System.out.println("Displaying the list");
                list.display();
                break;
                
                
        case 3: System.out.println("Enter value and position,(position starts at 0)");
                 val=sc.nextInt();        
                 pos=sc.nextInt();
                if(pos<0) {
                	System.out.println("Invalid position");
                	break;
                }
                list.insert(val,pos);
                break;
                
        case 4:System.out.println("Enter position to delete"); 
               pos=sc.nextInt();
               if(pos<0) {
            	   System.out.println("Invalid position");
            	   break;
               }
              list.delete(pos);
               break;
    
        case 5: System.exit(0);
        
        case 6:System.out.println("Length of the array");
        int len=list.length();
        System.out.println("Length of the array is "+len);
        break;
        
        case 7:System.out.println("Size of the array....No. of elements in the array");
        int s=list.size();
        System.out.println("Size of the array is "+s);
        break;
        
        case 8: System.out.println("Deleting the last element");
                list.deleteAtLast();
                break;
          
        case 9: System.out.println("Getting value from the pos given");
                pos=sc.nextInt();
                s=list.get(pos);
                System.out.println("The value in the given pos is "+s);
                break;
                
        case 10:System.out.println("Enter pos and value to update");
                  pos=sc.nextInt();   
                   val=sc.nextInt();
                list.update(pos,val);
   
        
        default:System.out.println("Invalid choice");
        
                      
        }
		}
        
       
        	
        
	}

}
