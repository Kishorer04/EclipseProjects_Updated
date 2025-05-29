package andThenCompose;
import java.util.function.Function;

public class AndThenComposeExample {
	
	
public static void main(String[] args) {
	Function<String, String> tenth = str->{
		                                  System.out.println("Study 10th first "+ str);
		                                   return "";
	                                      };
	                                      
	 Function <String, String> eleventh = str->{
		 										System.out.println("Study eleventh "+str);
		 									    return "";
	                                          }; 
	                                          
	  // tenth.apply("Hi");
	  // eleventh.apply("Hi");
	                                          
	    tenth.andThen(eleventh).apply("Hi");   //execute 10th then 11th   andThen()==>default method of Function interface                    
	    tenth.compose(eleventh).apply("Hi");   //execute 11th then 10th   compose()==>default method of Function interface                               
	                                      
}

}
