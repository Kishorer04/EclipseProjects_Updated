package Common_Package;
import java.util.Arrays;

public class Check3 {

	public static void main(String[] args) {
		System.out.println("Inside main method");
		System.out.println(Arrays.toString(args));
		names();

	}
	
	
	static void names() {
		System.out.println("Inside names method");
		String[] str = {"Arun","Varun","Tharun"};
		main(str);
	}

}
