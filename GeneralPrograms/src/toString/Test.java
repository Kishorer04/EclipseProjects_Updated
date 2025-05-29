package toString;

public class Test {
	
	String name;
	int age;

	public Test(String name, int age) {
		this.name=name;
		this.age=age;
	}

	public static void main(String[] args) {
	
		Test t= new Test("Kishore",22);
		Test t2= new Test("Vicky",15);
		
		System.out.println(t);
		System.out.println(t2);
		
	}
    
	@Override
    public String toString() {
		return this.name +" "+this.age;
    	
    }
}
