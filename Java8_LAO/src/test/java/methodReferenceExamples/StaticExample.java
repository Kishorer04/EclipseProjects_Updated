package methodReferenceExamples;

@FunctionalInterface
interface IAdd{
	
public void add(int n1, int n2);

}

public class StaticExample {
	
	public static void sum(int val1, int val2) {
		System.out.println(val1 + val2);
	}


public static void main(String[] args) {
	
//	IAdd iAdd = (n1,n2)->System.out.println(n1+n2);
//	iAdd.add(1, 2);
	
	IAdd iAdd = StaticExample::sum;
	iAdd.add(1, 2);
}

//Note:
// To use method reference, the abstract method in the functional interface (add) and the method to be referenced
//(sum) don't require to have the same method signature. The access specifier can be different, return type can be different, 
//but both the methods should have the same number and type of parameters.
	
}
