package interfaceDemo;

public class ClassDemo implements CheckInterface3 {

	public static void main(String[] args) {
		
		//ClassDemo cd=new ClassDemo();  (or)
		CheckInterface3 cd=new ClassDemo();
		cd.xerox();
		cd.print();
		cd.copy();
		System.out.println(ClassDemo.LEAVES);
		System.out.println(CheckInterface3.LEAVES);
		System.out.println(ClassDemo.SALARY);
		System.out.println(CheckInterface3.SALARY);
		

	}

	@Override
	public void print() {
		System.out.println("Hi in print");
		
	}

	@Override
	public void copy() {
		System.out.println("Hi in copy");
		
	}

	@Override
	public void xerox() {
		System.out.println("Hi in xerox");
		
	}

}
