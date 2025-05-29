package Common_Package;

public class HashCode {

	public static void main(String[] args) {
	 String str ="Kishore";
	 String str1 = str;
	 
	 System.out.println(str.hashCode());
	 System.out.println(str1.hashCode());
	 
	 System.out.println(System.identityHashCode(str));
			 

	}

}
