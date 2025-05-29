package Common_Package;
import java.util.Scanner;

public class MathOperations {

	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	  
	    int a,b,c,choice,option;
	    
	    do {
	    
	    System.out.println("\t various operators in java \n");
        System.out.println("1 add\n");
        System.out.println("2 sub\n");
        System.out.println("3 mul\n");
        System.out.println("4 div\n");
        System.out.println("Enter your choice\n");
        choice=sc.nextInt();
        System.out.println("Enter value of a\n");
        a=sc.nextInt();
        System.out.println("enter value of b\n");
        b=sc.nextInt();
        
        switch (choice)
        {
	        case 1:
		        c=a+b;
		        System.out.println("Add"+c);
		        break;
	      
	        
	        case 2:
	        	c=a-b;
	        	System.out.println("sub"+c);
	        	break;
	        	
	        
	        case 3:
	        	c=a*b;
	        	System.out.println("mul"+c);
	        	break;
	        	
	      
	        case 4:
	        	c=a/b;
	        	System.out.println("div"+c);
	        	break;
	        	
	        default:
	            System.out.println("Enter correct choice");
	            
        }
        
        System.out.println("Do you want to continue--  1/0");
        option=sc.nextInt();
     
          
	    }while(option==1);
	  
	    
	
	    
	

	}

}
