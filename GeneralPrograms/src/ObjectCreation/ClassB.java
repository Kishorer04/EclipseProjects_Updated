package ObjectCreation;


public class ClassB {
	
    public static void main(String[] args) {
        ClassA result = createMyClassInstance(42);
        System.out.println("Value: " + result.getValue());
    }

    public static ClassA createMyClassInstance(int value) {
        return new ClassA(value);
    }
}