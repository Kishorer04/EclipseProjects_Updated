package Inheritance;

public class MultipleMain {
	
	public static void main(String r) {
		System.out.println(r);
	}
	
	
	public static  void main(int i) {
		System.out.println(i);
	}
	
	
	public static void main(String[] args) {
		//MultipleMain mm=new MultipleMain();
		MultipleMain.main(7);
		main("Vanakam");
		
	}

}
