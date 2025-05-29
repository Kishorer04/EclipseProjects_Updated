package RandomQuizes;

class Math{
	public final double secret =2;
	
	void methCheck() {
		System.out.println("Math");
	}
}

class ComplexMath extends Math{
	public final double secret =4;
	
	void methCheck() {
		System.out.println("ComplexMath");
	}
}

public class InfiniteMath extends ComplexMath {
	
	public final double secret = 8;
     
	void methCheck() {
		System.out.println("Infinite Math");
	}
	
	public static void main(String[] args) {
    InfiniteMath math = new InfiniteMath();
    System.out.println(math.secret);
    math.methCheck();

	}

}
