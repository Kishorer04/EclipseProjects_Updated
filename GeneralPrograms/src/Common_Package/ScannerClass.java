package Common_Package;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
//
//public class ScannerClass {
//
//	public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	
//	System.out.println("Enter your name");
//	System.out.println(sc.next());
//	System.out.println(sc.hasNext());
//	System.out.println(sc.next());
//	
//	
//	}
//
//}
public class ScannerClass {    
    public static void main(String args[]) throws SQLException{       
           String s = "Hello, This is JavaTpoint.";  
         //Create scanner Object and pass string in it  
         Scanner scan = new Scanner(s);  
         //Check if the scanner has a token  
         System.out.println(scan.next());
         ResultSet rs = null;
       
         
         while(rs.next()) {
         System.out.println("Result: " + scan.nextLine());  
         //Print the string  
        // System.out.println("String: " +scan.nextLine());  
         //Check if the scanner has a token after printing the line  
         System.out.println("Final Result: " + scan.hasNext());  
         
       } 
         System.out.println("Came out of loop");

    } 
    }  