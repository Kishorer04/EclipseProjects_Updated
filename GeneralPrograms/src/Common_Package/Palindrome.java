package Common_Package;
import java.util.Scanner;

public class Palindrome {

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to check palindrome");
        String str=sc.next();
        Palindrome pd=new Palindrome();
        String reversedString=pd.revStr(str);
        System.out.println("Reversed string is "+reversedString);
        
        if(str.equals(reversedString))
        	System.out.println("It is a palindrome");
        else
        	System.out.println("Not palindrome");
    
    }
    
    
    public String revStr(String x){
         String reverse = "";
         System.out.println(x.length());
         int i;
         for(i=0;i<x.length();i++){
         reverse=x.charAt(i)+reverse;
         }
         System.out.println("i is "+i);
         return reverse;
    }
   
    
    
    
}